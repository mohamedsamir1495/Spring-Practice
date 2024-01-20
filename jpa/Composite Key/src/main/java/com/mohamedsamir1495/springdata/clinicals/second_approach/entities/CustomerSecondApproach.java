package com.mohamedsamir1495.springdata.clinicals.second_approach.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
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
@Table(name = "customer_composite_key")
public class CustomerSecondApproach {

	@EmbeddedId
	CustomerId id;

	private String name;
}
