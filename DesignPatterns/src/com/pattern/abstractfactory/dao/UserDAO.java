package com.pattern.abstractfactory.dao;

import com.pattern.abstractfactory.entity.User;

public interface UserDAO {
	User get(Long id);

	void add(User user);

	void delete(User user);

	void edit(User user);
}
