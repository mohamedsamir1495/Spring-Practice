package com.mohamedsamir1495.springdata.componentmapping;

import com.mohamedsamir1495.springdata.componentmapping.entities.Address;
import com.mohamedsamir1495.springdata.componentmapping.entities.Employee;
import com.mohamedsamir1495.springdata.componentmapping.repos.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ComponentmappingApplicationTests {

	@Autowired
	EmployeeRepository repository;


	@Test
	public void testCreate() {
		Employee employee = Employee.builder()
									.id(123)
									.name("Bharath")
									.address(Address.builder()
													.city("Austin")
													.streetaddress("Spicewood Springs")
													.country("USA")
													.state("TEXAS")
													.zipcode("78750")
													.build())
									.build();
		repository.save(employee);
	}
}
