package com.hzy.java.pattern.factory.abstract_factory;
//具体工厂：海尔工厂，生产海尔的一系列产品
public class HaierFactory extends HouseElecFactory{
	@Override
	public AirCondition buildAirCondition() {
		return new HaierAirCondition();
	}

	@Override
	public Fridge buildFridge() {
		return new HaierFridge();
	}
}
