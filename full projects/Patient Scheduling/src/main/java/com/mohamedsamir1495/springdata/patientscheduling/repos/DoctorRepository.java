package com.mohamedsamir1495.springdata.patientscheduling.repos;

import com.mohamedsamir1495.springdata.patientscheduling.entities.Doctor;
import org.springframework.data.repository.CrudRepository;

public interface DoctorRepository extends CrudRepository<Doctor, Long> {

}
