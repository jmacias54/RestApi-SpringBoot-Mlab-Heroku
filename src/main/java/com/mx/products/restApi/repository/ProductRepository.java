package com.mx.products.restApi.repository;

import org.springframework.data.repository.CrudRepository;

import com.mx.products.restApi.model.Product;

public interface ProductRepository extends CrudRepository<Product, String> {

	@Override
    Product findOne(String id);

    @Override
    void delete(Product deleted);
}
