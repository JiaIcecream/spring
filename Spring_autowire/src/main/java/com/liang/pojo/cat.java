package com.liang.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class cat {

	@Value("miao")
	private String name;

	public void show() {
		System.out.println("cat~");
	}
}
