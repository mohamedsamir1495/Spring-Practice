package com.mohamedsamir1495.springdata.product.repos;

import com.mohamedsamir1495.springdata.product.modal.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Integer> {

	@Query(value = "CALL GetAllProducts", nativeQuery = true)
	List<Product> findAllProducts();

	@Query(value = "CALL GetAllProductsByPrice (:price)", nativeQuery = true)
	List<Product> findAllProductsByPrice(double price);

	@Query(value = "CALL GetAllProductsCountByPrice (:price)", nativeQuery = true)
	Integer findAllProductsCountByPrice(double price);

}
