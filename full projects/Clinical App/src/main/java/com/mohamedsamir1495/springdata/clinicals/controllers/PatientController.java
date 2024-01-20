package com.mohamedsamir1495.springdata.clinicals.controllers;

import com.mohamedsamir1495.springdata.clinicals.dto.PatientDTO;
import com.mohamedsamir1495.springdata.clinicals.services.PatientService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api")
public class PatientController {

	private PatientService patientService;

	@GetMapping(value = "/patients")
	public List<PatientDTO> getPatients() {
		return patientService.getPatients();
	}

	@GetMapping(value = "/patients/{id}")
	public PatientDTO getPatient(@PathVariable("id") int id) {
		return patientService.getPatient(id);
	}

	@PostMapping(value = "/patients")
	public PatientDTO savePatient(@RequestBody PatientDTO patient) {
		return patientService.savePatient(patient);
	}

	@GetMapping(value = "/patients/analyze/{id}")
	public PatientDTO analyze(@PathVariable("id") int id) {
		return patientService.analyze(id);
	}
}
