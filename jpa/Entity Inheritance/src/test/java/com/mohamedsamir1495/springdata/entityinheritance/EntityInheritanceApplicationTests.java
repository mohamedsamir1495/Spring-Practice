package com.mohamedsamir1495.springdata.entityinheritance;

import com.mohamedsamir1495.springdata.entityinheritance.entities.Check;
import com.mohamedsamir1495.springdata.entityinheritance.entities.CreditCard;
import com.mohamedsamir1495.springdata.entityinheritance.repos.PaymentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class EntityInheritanceApplicationTests {

	@Autowired
	PaymentRepository repository;

	@Test
	public void createPayment() {
		CreditCard cc = CreditCard.builder()
								  .id(123)
								  .amount(1000)
								  .cardnumber("1234567890")
								  .build();
		repository.save(cc);
	}

	@Test
	public void createCheckPayment() {
		Check ch = Check.builder()
						.id(124)
						.amount(1000)
						.checknumber("1234567890")
						.build();
		repository.save(ch);
	}

}
