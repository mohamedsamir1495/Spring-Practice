package com.mohamedsamir1495.springdata.relations.onetomany.repos;

import com.mohamedsamir1495.springdata.relations.onetomany.entities.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

}
