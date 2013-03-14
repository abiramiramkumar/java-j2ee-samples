package com.pattern.abstractfactory.dao;

import com.pattern.abstractfactory.entity.Product;

public interface ProductDAO {
	Product get(Long id);

	void add(Product product);

	void delete(Product product);

	void edit(Product product);
}
