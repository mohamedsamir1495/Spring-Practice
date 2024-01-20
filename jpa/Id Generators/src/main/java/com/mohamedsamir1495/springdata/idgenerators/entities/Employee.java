package com.mohamedsamir1495.springdata.idgenerators.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Entity
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

	@Id
	//	@GeneratedValue(strategy = GenerationType.AUTO)
		@GeneratedValue(strategy = GenerationType.IDENTITY)
	//	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	//	@GeneratedValue(strategy = GenerationType.UUID)
	//	@GeneratedValue(generator = "emp_id")
	//	@GenericGenerator(name = "emp_id", type = CustomRandomIDGenerator.class)
	//	@GeneratedValue(strategy = GenerationType.TABLE, generator = "employee_gen")
	//	@TableGenerator(name = "employee_gen", table = "id_generator_lesson_2", pkColumnName = "gen_name", valueColumnName = "gen_val", allocationSize = 150)
	private Long id;
	private String name;

}
