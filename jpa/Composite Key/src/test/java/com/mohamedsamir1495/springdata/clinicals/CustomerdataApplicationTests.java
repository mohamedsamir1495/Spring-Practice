package com.mohamedsamir1495.springdata.clinicals;

import com.mohamedsamir1495.springdata.clinicals.first_approach.entities.CustomerFirstApproach;
import com.mohamedsamir1495.springdata.clinicals.first_approach.repository.CustomerRepositoryFirstApproach;
import com.mohamedsamir1495.springdata.clinicals.second_approach.entities.CustomerId;
import com.mohamedsamir1495.springdata.clinicals.second_approach.entities.CustomerSecondApproach;
import com.mohamedsamir1495.springdata.clinicals.second_approach.repository.CustomerRepositorySecondApproach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CustomerdataApplicationTests {

	@Autowired
	private CustomerRepositoryFirstApproach repoFirstApproach;

	@Autowired
	private CustomerRepositorySecondApproach repoSecondApproach;

	@Test
	public void testCreateCustomerFirstApproach() {
		CustomerFirstApproach customer = CustomerFirstApproach.builder()
															  .id(1234)
															  .email("test@test.com")
															  .name("test")
															  .build();
		repoFirstApproach.save(customer);
	}

	@Test
	public void testCreateCustomerSecondApproach() {
		var customer = CustomerSecondApproach.builder()
											 .id(CustomerId.builder().id(4321).email("test@test.com").build())
											 .name("test2")
											 .build();

		repoSecondApproach.save(customer);
	}
}
