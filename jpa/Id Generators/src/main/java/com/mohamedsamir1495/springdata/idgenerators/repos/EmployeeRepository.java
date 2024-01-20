package com.mohamedsamir1495.springdata.idgenerators.repos;

import org.springframework.data.repository.CrudRepository;

import com.mohamedsamir1495.springdata.idgenerators.entities.Employee;


public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}
