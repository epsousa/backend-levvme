package com.br.levvme.levvme.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.br.levvme.levvme.model.Product;

public interface ProductRepository extends MongoRepository<Product, String> {

}
