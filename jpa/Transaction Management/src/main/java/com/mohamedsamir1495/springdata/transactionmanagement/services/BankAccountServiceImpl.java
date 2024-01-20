package com.mohamedsamir1495.springdata.transactionmanagement.services;

import com.mohamedsamir1495.springdata.transactionmanagement.entities.BankAccount;
import com.mohamedsamir1495.springdata.transactionmanagement.repos.BankAccountRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@AllArgsConstructor
public class BankAccountServiceImpl implements BankAccountService{

	BankAccountRepository repository;

	@Override
	@Transactional
	public void transfer(int amount) {
		BankAccount obamaAccount = repository.findById(1).get();
		obamaAccount.setBal(obamaAccount.getBal() - amount);
		repository.save(obamaAccount);

		if(true)
			throw new RuntimeException();

		BankAccount trumpsAccount = repository.findById(2).get();
		trumpsAccount.setBal(trumpsAccount.getBal() + amount);
		repository.save(trumpsAccount);
	}
}
