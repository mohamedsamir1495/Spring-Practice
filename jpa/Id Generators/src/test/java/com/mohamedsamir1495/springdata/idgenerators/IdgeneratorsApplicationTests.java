package com.mohamedsamir1495.springdata.idgenerators;

import com.mohamedsamir1495.springdata.idgenerators.entities.Employee;
import com.mohamedsamir1495.springdata.idgenerators.repos.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class IdGeneratorsApplicationTests {

	@Autowired
	EmployeeRepository er;

	@Test
	void testCreateEmployee() {

		Employee employee = new Employee();
		employee.setName("John");

		Employee savedEmployee = er.save(employee);
		assertNotNull(savedEmployee.getId());
	}

}
