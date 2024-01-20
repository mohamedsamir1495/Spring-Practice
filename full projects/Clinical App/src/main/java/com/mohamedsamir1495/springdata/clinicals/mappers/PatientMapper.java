package com.mohamedsamir1495.springdata.clinicals.mappers;

import com.mohamedsamir1495.springdata.clinicals.dto.PatientDTO;
import com.mohamedsamir1495.springdata.clinicals.entities.Patient;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = { ClinicalDataMapper.class })
public interface PatientMapper {

	PatientDTO fromEntityToDto(Patient entity);

	Patient fromDtoToEntity(PatientDTO dto);
}
