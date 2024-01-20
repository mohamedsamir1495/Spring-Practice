package com.mohamedsamir1495.springdata.patientscheduling;

import com.mohamedsamir1495.springdata.patientscheduling.entities.Appointment;
import com.mohamedsamir1495.springdata.patientscheduling.entities.Doctor;
import com.mohamedsamir1495.springdata.patientscheduling.entities.Insurance;
import com.mohamedsamir1495.springdata.patientscheduling.entities.Patient;
import com.mohamedsamir1495.springdata.patientscheduling.repos.AppointmentRepository;
import com.mohamedsamir1495.springdata.patientscheduling.repos.DoctorRepository;
import com.mohamedsamir1495.springdata.patientscheduling.repos.PatientRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@SpringBootTest
public class PatientSchedulingApplicationTests {

	@Autowired
	DoctorRepository doctorRepository;

	@Autowired
	PatientRepository patientRepository;

	@Autowired
	AppointmentRepository appointmentRepository;

	@Test
	public void testCreateDoctor() {

		List<Doctor> list = new ArrayList<>();
		for (int i = 1; i <= 50; i++) {
			list.add(Doctor.builder()
						   .id((long) i)
						   .firstName("Mohamed")
						   .lastName("Samir")
						   .speciality("All2")
						   .build());
		}

		doctorRepository.saveAll(list);
	}

	@Test
	public void testCreatePatient() {

		Patient patient = Patient.builder()
								 .firstName("Doug")
								 .lastName("Bailey")
								 .phone("123456")
								 .build();

		Insurance insurance = Insurance.builder()
									   .providerName("Blue Cross Blue Shield")
									   .copay(20d)
									   .build();

		patient.setInsurance(insurance);

		Doctor doctor = doctorRepository.findById(1L).get();
		List<Doctor> doctors = List.of(doctor);
		patient.setDoctors(doctors);

		patientRepository.save(patient);

	}

	@Test
	public void testCreateAppointment() {

		Timestamp appointmentTime = new Timestamp(new Date().getTime());
		Appointment appointment = Appointment.builder()
											 .appointmentTime(appointmentTime)
											 .reason("I have a problem")
											 .started(true)
											 .build();

		appointment.setPatient(patientRepository.findById(1l).get());
		appointment.setDoctor(doctorRepository.findById(1L).get());

		appointmentRepository.save(appointment);
	}

}
