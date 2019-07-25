package com.hzy.java.pattern.factory.abstract_factory_up1;
//具体产品：格力空调
public class GeLiAirCondition extends AirCondition{
	@Override
	public void fresh() {
		System.out.println("我是格力空调，具有清新空气的功能");
	}
}
