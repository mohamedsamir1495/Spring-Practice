package com.mohamedsamir1495.springdata.transactionmanagement;

import com.mohamedsamir1495.springdata.transactionmanagement.services.BankAccountService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TransactionManagementApplicationTests {

	@Autowired
	BankAccountService bankAccountService;

	@Test
	public void testTransfer() {
		bankAccountService.transfer(500);
	}

}
