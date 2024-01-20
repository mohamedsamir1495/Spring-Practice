package com.mohamedsamir1495.springdata.entityinheritance.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Entity
@Getter
@Setter
@SuperBuilder
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table(name="card")
@PrimaryKeyJoinColumn(name="id")
//@DiscriminatorValue("cc") // Case Single Table
public class CreditCard extends Payment{

	private String cardnumber;

}
