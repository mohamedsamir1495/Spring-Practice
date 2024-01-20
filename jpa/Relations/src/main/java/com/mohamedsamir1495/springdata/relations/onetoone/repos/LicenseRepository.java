package com.mohamedsamir1495.springdata.relations.onetoone.repos;

import com.mohamedsamir1495.springdata.relations.onetoone.entities.License;
import org.springframework.data.repository.CrudRepository;

public interface LicenseRepository extends CrudRepository<License, Long> {

}
