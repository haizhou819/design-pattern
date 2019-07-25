package com.hzy.java.pattern.factory.abstract_factory_up2;
//具体产品：海尔冰箱
public class HaierFridge extends Fridge{
	@Override
	public void freeze() {
		System.out.println("我是海尔冰箱，具有冷冻的功能");
	}
}
