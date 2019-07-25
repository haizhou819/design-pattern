package com.hzy.java.pattern.factory.abstract_factory_up2;
//具体产品：格力冰箱
public class GeLiFridge extends Fridge{
	@Override
	public void freeze() {
		System.out.println("我是格力冰箱,具有冷冻的功能");
	}
}
