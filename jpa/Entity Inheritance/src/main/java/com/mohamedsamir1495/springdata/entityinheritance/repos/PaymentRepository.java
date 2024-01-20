package com.mohamedsamir1495.springdata.entityinheritance.repos;

import org.springframework.data.repository.CrudRepository;

import com.mohamedsamir1495.springdata.entityinheritance.entities.Payment;

public interface PaymentRepository extends CrudRepository<Payment, Integer> {

}
