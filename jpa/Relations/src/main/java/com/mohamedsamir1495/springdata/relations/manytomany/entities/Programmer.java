package com.mohamedsamir1495.springdata.relations.manytomany.entities;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
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
public class Programmer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	@Column(name = "salary")
	private int sal;

	@ToString.Exclude
	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	//		@ManyToMany(mappedBy = "programmers")
	@JoinTable(name = "programmers_projects",
			   joinColumns = @JoinColumn(name = "programmer_id", referencedColumnName = "id"),
			   inverseJoinColumns = @JoinColumn(name = "project_id", referencedColumnName = "id"))
	private Set<Project> projects;


}
