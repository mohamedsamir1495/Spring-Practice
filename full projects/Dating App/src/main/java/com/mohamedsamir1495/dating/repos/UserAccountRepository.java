package com.mohamedsamir1495.dating.repos;

import java.util.List;

import com.mohamedsamir1495.dating.entities.UserAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserAccountRepository extends JpaRepository<UserAccount, Integer> {

	@Query("from UserAccount where age=:age and city=:city and country=:country and id!=:id")
	List<UserAccount> findMatches(@Param("age") int age,@Param("city") String city,
			@Param("country") String country,@Param("id") int id);
}
