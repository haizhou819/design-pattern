package com.hzy.java.pattern.factory.factory_method;

import com.hzy.java.pattern.factory.factory_method.Fridge;

public class HaierFridgeFactory extends FridgeFactory{
	@Override
	public Fridge buildFridge() {
		return new HaierFridge();
	}
}
