package com.mohamedsamir1495.springdata.clinicals.first_approach.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
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
@IdClass(CustomerId.class)
@Table(name = "customer_composite_key")
public class CustomerFirstApproach {

	@Id
	private int id;
	@Id
	private String email;
	private String name;
}
