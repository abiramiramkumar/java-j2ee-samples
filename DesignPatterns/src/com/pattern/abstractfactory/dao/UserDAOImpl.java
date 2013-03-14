package com.pattern.abstractfactory.dao;

import com.pattern.abstractfactory.entity.User;
import com.pattern.abstractfactory.solution.FactoryConfig;

public class UserDAOImpl implements UserDAO {
	private FactoryConfig factoryConfig;

	public UserDAOImpl(FactoryConfig newFactoryConfig) {
		factoryConfig = newFactoryConfig;
	}

	@Override
	public User get(Long id) {
		return new User(id, "wasif");
	}

	@Override
	public void add(User user) {
		System.out.println("User Added: " + user);
	}

	@Override
	public void delete(User user) {
		System.out.println("User Deleted: " + user);
	}

	@Override
	public void edit(User user) {
		System.out.println("User Edited: " + user);
	}

	public FactoryConfig getFactoryConfig() {
		return factoryConfig;
	}

}
