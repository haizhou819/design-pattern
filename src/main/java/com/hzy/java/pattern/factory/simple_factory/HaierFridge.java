package com.hzy.java.pattern.factory.simple_factory;
//具体产品：海尔冰箱
public class HaierFridge extends Fridge{
	@Override
	public void freeze() {
		System.out.println("我是海尔冰箱，具有冷冻的功能");
	}
}
