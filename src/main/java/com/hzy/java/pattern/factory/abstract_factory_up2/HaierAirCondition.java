package com.hzy.java.pattern.factory.abstract_factory_up2;
//具体产品：海尔空调
public class HaierAirCondition extends AirCondition{
	@Override
	public void fresh() {
		System.out.println("我是海尔空调，具有清新空气的功能");
	}
}
