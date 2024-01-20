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
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "bankcheck")
@PrimaryKeyJoinColumn(name = "id")
//@DiscriminatorValue("ch") // Case Single Table
public class Check extends Payment {

	private String checknumber;

}
