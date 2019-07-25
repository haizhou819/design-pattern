package com.hzy.java.pattern.factory.abstract_factory;
//具体工厂：格力工厂，生产格力的一系列产品
public class GeLiFactory extends HouseElecFactory{
	@Override
	public AirCondition buildAirCondition() {
		return new GeLiAirCondition();
	}
	@Override
	public Fridge buildFridge() {
		return new GeLiFridge();
	}
}
