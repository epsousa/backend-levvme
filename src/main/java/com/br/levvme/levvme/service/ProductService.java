package com.br.levvme.levvme.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.levvme.levvme.model.Product;
import com.br.levvme.levvme.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	ProductRepository productRepository;

	public List<Product> get() {

		return productRepository.findAll();
	}

	public Product getById(String id) {

		return productRepository.findById(id).orElse(null);
	}

	public void save(Product prod) {
		Long a = (long) (productRepository.findAll().size() + 1);
		
		prod.setId(a.toString());

		productRepository.save(prod);
	}

	public void update(Product prod) {

		productRepository.save(prod);
	}

	public void delete(String id) {
		
		Product prod = productRepository.findById(id).orElse(null);
		
		productRepository.delete(prod);
	}

}
