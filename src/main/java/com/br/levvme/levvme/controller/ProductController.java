package com.br.levvme.levvme.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.levvme.levvme.model.Product;
import com.br.levvme.levvme.service.ProductService;

@RestController
@RequestMapping("/product")
@CrossOrigin(origins = "*")
public class ProductController {

	@Autowired
	private ProductService productService;

	@GetMapping
	public List<Product> get() {
		return productService.get();
	}

	@GetMapping("/{id}")
	public Product get(@PathVariable(value = "id") String id) {
		return productService.getById(id);
	}

	@PostMapping
	public void insert(@RequestBody Product prod) {
		productService.save(prod);
	}

	@PutMapping
	public void update(@RequestBody Product prod) {
		productService.update(prod);
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable(value = "id") String id) {
		productService.delete(id);
	}

}
