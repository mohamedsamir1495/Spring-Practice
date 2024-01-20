package com.mohamedsamir1495.springdata.product;

import com.mohamedsamir1495.springdata.product.repos.ProductRepository;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
class StoredProcedureApplicationTests {

	@Autowired
	ProductRepository repository;

	@Test
	public void testFindAllProducts() {
		log.info(repository.findAllProducts().toString());
	}

	@Test
	public void testFindAllProductsByPrice() {
		log.info(repository.findAllProductsByPrice(800).toString());
	}

	@Test
	public void testFindAllProductsCountByPrice() {
		log.info("Count : {}", repository.findAllProductsCountByPrice(800).toString());
	}
}
