package com.hzy.java.pattern.factory.simple_factory;
/**
 * 
* @ClassName:Client 
* @Description:简单工厂三个要素：具体工厂、抽象产品、具体产品
* @author:hzyuan@iflytek.com 
* @date:2019年6月26日
*
 */
public class Client {
	public static void main(String[] args) {
		Fridge geliFridge = FridgeSimpleFactory.buildFridge("geli");
		geliFridge.freeze();
		
		Fridge haierFridge = FridgeSimpleFactory.buildFridge("haier");
		haierFridge.freeze();
	}
}
