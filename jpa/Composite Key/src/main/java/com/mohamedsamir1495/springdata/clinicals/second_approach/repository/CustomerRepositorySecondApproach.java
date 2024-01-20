package com.mohamedsamir1495.springdata.clinicals.second_approach.repository;

import com.mohamedsamir1495.springdata.clinicals.second_approach.entities.CustomerSecondApproach;
import com.mohamedsamir1495.springdata.clinicals.second_approach.entities.CustomerId;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepositorySecondApproach extends CrudRepository<CustomerSecondApproach, CustomerId> {


}
