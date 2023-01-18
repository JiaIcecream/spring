package com.liang.demo01;

public class Proxy implements rent{

	private Host host;

	public Proxy(Host host) {
		this.host = host;
	}
	// 实现租房这项功能
	@Override
	public void rent() {
		// 在租房这件事情是会有一些额外的操作
		seeHouse();
		// 将房东的房子租出去
		host.rent();

		doContract();

	}
	public void seeHouse() {
		System.out.println("中介带你看房");
	}

	public void doContract() {
		System.out.println("签合同");
	}
}
