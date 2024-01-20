package com.mohamedsamir1495.springdata.relations.onetomany.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "phone_number")
public class PhoneNumber {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String number;
	private String type;

	@ManyToOne
	@ToString.Exclude
	@JoinColumn(name = "customer_id")
	private Customer customer;

}
