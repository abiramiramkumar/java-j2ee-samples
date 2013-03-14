package com.pattern.abstractfactory.entity;

public class Product {
	private Long id;
	private String name;

	public Product() {

	}

	public Product(Long newId, String newName) {
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
		return "Product[ id:" + getId() + ", Name:" + getName() + "]";
	}
}
