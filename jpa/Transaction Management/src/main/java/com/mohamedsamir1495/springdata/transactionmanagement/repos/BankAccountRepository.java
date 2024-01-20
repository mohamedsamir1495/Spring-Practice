package com.mohamedsamir1495.springdata.transactionmanagement.repos;

import com.mohamedsamir1495.springdata.transactionmanagement.entities.BankAccount;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BankAccountRepository extends CrudRepository<BankAccount, Integer> {

}
