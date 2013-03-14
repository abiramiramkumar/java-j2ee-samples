package com.pattern.abstractfactory.entity;

public class User {
	private Long id;
	private String name;

	public User() {

	}

	public User(Long newId, String newName) {
		id = newId;
		name = newName;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "User[ id:" + getId() + ", Name:" + getName() + "]";
	}
}
