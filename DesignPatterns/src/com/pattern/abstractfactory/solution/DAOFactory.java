package com.pattern.abstractfactory.solution;

import com.pattern.abstractfactory.dao.ProductDAO;
import com.pattern.abstractfactory.dao.UserDAO;

public interface DAOFactory {
	UserDAO getUserDAO();

	ProductDAO getProductDAO();
}
