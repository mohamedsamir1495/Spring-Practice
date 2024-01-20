package com.mohamedsamir1495.springdata.clinicals.services;

import com.mohamedsamir1495.springdata.clinicals.dto.PatientDTO;
import com.mohamedsamir1495.springdata.clinicals.entities.ClinicalData;
import com.mohamedsamir1495.springdata.clinicals.entities.Patient;
import com.mohamedsamir1495.springdata.clinicals.mappers.PatientMapper;
import com.mohamedsamir1495.springdata.clinicals.repositories.PatientRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class PatientService {

	private PatientRepository patientRepository;
	private PatientMapper patientMapper;

	public List<PatientDTO> getPatients() {
		return patientRepository.findAll()
								.stream()
								.map(patientMapper::fromEntityToDto).collect(Collectors.toList());
	}

	public PatientDTO getPatient(int id) {
		return patientRepository.findById(id).map(patientMapper::fromEntityToDto).orElse(null);
	}

	public PatientDTO savePatient(PatientDTO patient) {
		return patientMapper.fromEntityToDto(patientRepository.save(patientMapper.fromDtoToEntity(patient)));
	}

	public PatientDTO analyze(int id) {
		Map<String, String> filters = new HashMap<>();
		Patient patient = patientRepository.findById(id).get();
		List<ClinicalData> clinicalData = patient.getClinicalData();
		List<ClinicalData> duplicateClinicalData = new ArrayList<>(clinicalData);
		for (ClinicalData entry : duplicateClinicalData) {
			if (filters.containsKey(entry.getComponentName())) {
				clinicalData.remove(entry);
				continue;
			} else {
				filters.put(entry.getComponentName(), null);
			}
			if (entry.getComponentName().equals("hw")) {
				String[] heightAndWeight = entry.getComponentValue().split("/");
				if (!ObjectUtils.isEmpty(heightAndWeight)) {
					float heightInMeters = Float.parseFloat(heightAndWeight[0]) * 0.4536F;
					float bmi = Float.parseFloat(heightAndWeight[1]) / (heightInMeters * heightInMeters);
					ClinicalData bmiData = new ClinicalData();
					bmiData.setComponentName("bmi");
					bmiData.setComponentValue(Float.toString(bmi));
					clinicalData.add(bmiData);
				}
			}
		}
		return patientMapper.fromEntityToDto(patient);
	}
}
