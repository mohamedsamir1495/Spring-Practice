package com.mohamedsamir1495.springdata.clinicals.first_approach.repository;

import com.mohamedsamir1495.springdata.clinicals.first_approach.entities.CustomerFirstApproach;
import com.mohamedsamir1495.springdata.clinicals.first_approach.entities.CustomerId;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepositoryFirstApproach extends CrudRepository<CustomerFirstApproach, CustomerId> {


}
