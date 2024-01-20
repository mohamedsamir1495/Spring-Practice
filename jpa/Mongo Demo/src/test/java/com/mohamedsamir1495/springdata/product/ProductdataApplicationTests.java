package com.mohamedsamir1495.springdata.product;

import com.mohamedsamir1495.springdata.product.modal.Product;
import com.mohamedsamir1495.springdata.product.repos.ProductRepository;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@Slf4j
@SpringBootTest
class StoredProcedureApplicationTests {

	@Autowired
	ProductRepository repository;

	@Test
	public void testSave() {
		Product savedProduct =  repository.save(Product.builder().name("Mac Book Pro").price(2000f).build());
		assertNotNull(savedProduct);
	}

	@Test
	public void testFindAll() {
		List<Product> products = repository.findAll();
		assertEquals(1, products.size());
	}

	@Test
	public void testUpdate() {
		List<Product> products = repository.findAll();
		products.get(0).setName("Iphone");
		repository.save(products.get(0));
	}

	@Test
	public void testDelete() {
		List<Product> products = repository.findAll();
		repository.delete(products.get(0));
	}
}
