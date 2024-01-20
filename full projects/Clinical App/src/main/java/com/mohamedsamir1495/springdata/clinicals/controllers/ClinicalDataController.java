package com.mohamedsamir1495.springdata.clinicals.controllers;

import com.mohamedsamir1495.springdata.clinicals.dto.ClinicalDataDTO;
import com.mohamedsamir1495.springdata.clinicals.dto.ClinicalDataRequest;
import com.mohamedsamir1495.springdata.clinicals.services.ClinicalDataService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/api")
public class ClinicalDataController {

	private ClinicalDataService clinicalDataService;

	@PostMapping(value = "/clinicals")
	public ClinicalDataDTO saveClinicalData(@RequestBody ClinicalDataRequest request){
		return clinicalDataService.saveClinicalData(request);
	}
}
