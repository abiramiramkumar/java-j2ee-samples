package com.pattern.abstractfactory.dao;

import com.pattern.abstractfactory.entity.Product;
import com.pattern.abstractfactory.solution.FactoryConfig;

public class ProductDAOImpl implements ProductDAO {
	private FactoryConfig config;

	public ProductDAOImpl(FactoryConfig newConfig) {
		config = newConfig;
	}

	@Override
	public Product get(Long id) {
		return new Product(6789L, "book");
	}

	@Override
	public void add(Product product) {
		System.out.println("Product Added: " + product);
	}

	@Override
	public void delete(Product product) {
		System.out.println("Product Deleted: " + product);
	}

	@Override
	public void edit(Product product) {
		System.out.println("Product Edited: " + product);
	}

	public FactoryConfig getConfig() {
		return config;
	}

}
