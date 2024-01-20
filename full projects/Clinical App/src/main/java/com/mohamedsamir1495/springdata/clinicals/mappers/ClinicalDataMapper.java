package com.mohamedsamir1495.springdata.clinicals.mappers;

import com.mohamedsamir1495.springdata.clinicals.dto.ClinicalDataDTO;
import com.mohamedsamir1495.springdata.clinicals.entities.ClinicalData;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ClinicalDataMapper {

	ClinicalDataDTO fromEntityToDto(ClinicalData entity);

	ClinicalData fromDtoToEntity(ClinicalDataDTO dto);
}
