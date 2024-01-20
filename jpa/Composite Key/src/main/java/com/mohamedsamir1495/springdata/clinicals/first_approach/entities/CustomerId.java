package com.mohamedsamir1495.springdata.clinicals.first_approach.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class CustomerId implements Serializable {

	private static final long serialVersionUID = 1L;

	private int id;
	private String email;
}
