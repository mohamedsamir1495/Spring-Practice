package com.mohamedsamir1495.springdata.clinicals.second_approach.entities;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Embeddable
@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class CustomerId implements Serializable {

	private static final long serialVersionUID = 2L;

	private int id;
	private String email;
}
