package com.mohamedsamir1495.springdata.clinicals.services;

import com.mohamedsamir1495.springdata.clinicals.dto.ClinicalDataDTO;
import com.mohamedsamir1495.springdata.clinicals.dto.ClinicalDataRequest;
import com.mohamedsamir1495.springdata.clinicals.entities.ClinicalData;
import com.mohamedsamir1495.springdata.clinicals.mappers.ClinicalDataMapper;
import com.mohamedsamir1495.springdata.clinicals.repositories.ClinicalRepository;
import com.mohamedsamir1495.springdata.clinicals.repositories.PatientRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ClinicalDataService {

	private ClinicalRepository clinicalDataRepository;
	private PatientRepository patientRepository;

	private ClinicalDataMapper clinicalDataMapper;

	public ClinicalDataDTO saveClinicalData(ClinicalDataRequest request) {
		var patient = patientRepository.findById(request.getPatientId()).get();
		return clinicalDataMapper.fromEntityToDto(clinicalDataRepository.save(ClinicalData.builder()
																						  .componentName(request.getComponentName())
																						  .componentValue(request.getComponentValue())
																						  .patient(patient)
																						  .build()));
	}
}
