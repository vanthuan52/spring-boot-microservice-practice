package com.vanthuan0504.productservice.repository;

import com.vanthuan0504.productservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {

}
