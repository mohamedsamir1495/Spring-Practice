package com.mohamedsamir1495.springdata.product.repos;

import com.mohamedsamir1495.springdata.product.modal.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {


}
