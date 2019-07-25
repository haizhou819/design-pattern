package com.hzy.java.pattern.factory.factory_method;

public class GeliFridgeFactory extends FridgeFactory{
	@Override
	public Fridge buildFridge() {
		return new GeLiFridge();
	}
}
