package com.mohamedsamir1495.springdata.patientscheduling.repos;

import org.springframework.data.repository.CrudRepository;

import com.mohamedsamir1495.springdata.patientscheduling.entities.Patient;

public interface PatientRepository extends CrudRepository<Patient, Long> {

}
