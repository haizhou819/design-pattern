package com.hzy.java.pattern.proxy.dynamic.cglib;

public class CglibProxyTest {
	public static void main(String[] args) {
		BuyHouse buyHouse = new BuyHouse();
		CglibProxyInterceptor proxyInterceptor = new CglibProxyInterceptor(buyHouse);
		BuyHouse buyHouseProxy = (BuyHouse)proxyInterceptor.getInstance();
		buyHouseProxy.buyHosue();
	}
}
