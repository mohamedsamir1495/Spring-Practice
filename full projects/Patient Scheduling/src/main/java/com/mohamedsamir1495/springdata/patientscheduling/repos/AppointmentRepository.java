package com.mohamedsamir1495.springdata.patientscheduling.repos;

import com.mohamedsamir1495.springdata.patientscheduling.entities.Appointment;
import org.springframework.data.repository.CrudRepository;

public interface AppointmentRepository extends CrudRepository<Appointment, Long> {

}
