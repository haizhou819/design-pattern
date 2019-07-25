package com.hzy.java.pattern.factory.simple_factory;

import com.hzy.java.pattern.factory.simple_factory.Fridge;
//具体工厂类
public class FridgeSimpleFactory {
	public  static Fridge buildFridge(String type){
		switch (type) {
		case "geli":
			return new GeLiFridge();
		case "haier":
			return new HaierFridge();
		default:
			break;
		}
		return null;
	}
}
