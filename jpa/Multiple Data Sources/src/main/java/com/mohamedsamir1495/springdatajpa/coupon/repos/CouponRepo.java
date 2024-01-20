package com.mohamedsamir1495.springdatajpa.coupon.repos;

import com.mohamedsamir1495.springdatajpa.coupon.entities.Coupon;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CouponRepo extends JpaRepository<Coupon, Long> {

}
