package com.hzy.java.pattern.factory.abstract_factory;
//抽象工厂：家电工厂
public abstract class HouseElecFactory {
	public abstract AirCondition buildAirCondition();
	public abstract Fridge buildFridge();
}
