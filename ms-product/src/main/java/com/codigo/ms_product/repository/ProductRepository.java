package com.codigo.ms_product.repository;

import com.codigo.ms_product.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {

}
