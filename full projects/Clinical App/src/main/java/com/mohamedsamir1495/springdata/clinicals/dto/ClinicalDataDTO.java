package com.mohamedsamir1495.springdata.clinicals.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ClinicalDataDTO {

	private int id;
	private String componentName;
	private String componentValue;
	private Timestamp measuredDateTime;
}
