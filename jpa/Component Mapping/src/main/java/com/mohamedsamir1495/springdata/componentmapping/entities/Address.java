package com.mohamedsamir1495.springdata.componentmapping.entities;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@ToString
@Embeddable
@NoArgsConstructor
@AllArgsConstructor
public class Address {

	private String streetaddress;
	private String city;
	private String state;
	private String zipcode;
	private String country;

}
