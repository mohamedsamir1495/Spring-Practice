package com.mohamedsamir1495.springdata.clinicals.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PatientDTO {

	private int id;
	private String firstName;
	private String lastName;
	private int age;

	private List<ClinicalDataDTO> clinicalData;
}
