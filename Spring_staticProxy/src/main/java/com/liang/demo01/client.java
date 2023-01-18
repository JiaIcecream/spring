package com.liang.demo01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class client {
	public static void main(String[] args) {
		//代理模式
		Host host = new Host();

		Proxy proxy = new Proxy(host);

		proxy.rent();

	}
}
