package com.mohamedsamir1495.springdata.clinicals.repositories;

import com.mohamedsamir1495.springdata.clinicals.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Integer> {

}
