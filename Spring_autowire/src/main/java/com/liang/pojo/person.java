package com.liang.pojo;

import org.springframework.beans.factory.annotation.Autowired;

public class person {
	private String name;
	@Autowired
	private cat cat;
	@Autowired
	private dog dog;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public com.liang.pojo.cat getCat() {
		return cat;
	}

	public void setCat(com.liang.pojo.cat cat) {
		this.cat = cat;
	}

	public com.liang.pojo.dog getDog() {
		return dog;
	}

	public void setDog(com.liang.pojo.dog dog) {
		this.dog = dog;
	}

	@Override
	public String toString() {
		return "person{" +
				"name='" + name + '\'' +
				", cat=" + cat +
				", dog=" + dog +
				'}';
	}
}
