package com.mohamedsamir1495.springdata.componentmapping.repos;

import org.springframework.data.repository.CrudRepository;

import com.mohamedsamir1495.springdata.componentmapping.entities.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

}
