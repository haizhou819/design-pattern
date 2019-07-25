package com.hzy.java.pattern.factory.factory_method;
/**
 * 
* @ClassName:Client 
* @Description:工厂方法模式四个要素：抽象工厂、具体工厂、抽象产品、具体产品。工厂方法模式只能生产一种类型的产品，生产多种类型的产品需要使用抽象工厂模式
* @author:hzyuan@iflytek.com 
* @date:2019年6月26日
*
 */
public class Client {
	public static void main(String[] args) {
		FridgeFactory fridgeFactory1 = new GeliFridgeFactory();
		Fridge geliFridge = fridgeFactory1.buildFridge();
		geliFridge.freeze();
		
		FridgeFactory fridgeFactory2 = new HaierFridgeFactory();
		Fridge haierFridge = fridgeFactory2.buildFridge();
		haierFridge.freeze();
	}
}
