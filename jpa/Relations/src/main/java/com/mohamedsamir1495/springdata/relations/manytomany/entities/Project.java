package com.mohamedsamir1495.springdata.relations.manytomany.entities;

import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
public class Project {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	@ToString.Exclude
	@ManyToMany(mappedBy = "projects")
//		@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	@JoinTable(name = "programmers_projects",
//			   joinColumns = @JoinColumn(name = "project_id", referencedColumnName = "id"),
//			   inverseJoinColumns = @JoinColumn(name = "programmer_id", referencedColumnName = "id"))
	private Set<Programmer> programmers;

}
