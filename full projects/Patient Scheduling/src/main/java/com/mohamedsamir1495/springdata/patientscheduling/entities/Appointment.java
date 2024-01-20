package com.mohamedsamir1495.springdata.patientscheduling.entities;

import java.sql.Timestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Appointment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Timestamp appointmentTime;
	private boolean started;
	private boolean ended;
	private String reason;

	@ManyToOne
	@JoinColumn(name = "patient_id")
	@ToString.Exclude
	private Patient patient;

	@ManyToOne
	@JoinColumn(name = "doctor_id")
	@ToString.Exclude
	private Doctor doctor;

}
