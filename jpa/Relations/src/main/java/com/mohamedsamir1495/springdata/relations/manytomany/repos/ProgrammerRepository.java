package com.mohamedsamir1495.springdata.relations.manytomany.repos;

import org.springframework.data.repository.CrudRepository;

import com.mohamedsamir1495.springdata.relations.manytomany.entities.Programmer;

public interface ProgrammerRepository extends CrudRepository<Programmer, Integer> {

}
