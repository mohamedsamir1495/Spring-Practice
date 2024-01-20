package com.mohamedsamir1495.springdata.clinicals.repositories;

import com.mohamedsamir1495.springdata.clinicals.entities.ClinicalData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClinicalRepository extends JpaRepository<ClinicalData, Integer> {

}
