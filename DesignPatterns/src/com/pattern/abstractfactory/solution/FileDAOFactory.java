package com.pattern.abstractfactory.solution;

import com.pattern.abstractfactory.dao.ProductDAO;
import com.pattern.abstractfactory.dao.ProductDAOImpl;
import com.pattern.abstractfactory.dao.UserDAO;
import com.pattern.abstractfactory.dao.UserDAOImpl;

public class FileDAOFactory implements DAOFactory {
	private FactoryConfig config;

	public FileDAOFactory(FactoryConfig newConfig) {
		if (newConfig == null) {
			throw new IllegalArgumentException("Config cannot be null");
		}
		config = newConfig;
	}

	@Override
	public UserDAO getUserDAO() {
		return new UserDAOImpl(config);
	}

	@Override
	public ProductDAO getProductDAO() {
		return new ProductDAOImpl(config);
	}

}
