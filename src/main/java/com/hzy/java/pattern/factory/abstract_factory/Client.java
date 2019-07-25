package com.hzy.java.pattern.factory.abstract_factory;
/**
 * 
* @ClassName:Client 
* @Description:抽象工厂模式四个要素：抽象工厂、具体工厂、抽象产品、具体产品。
* 多个抽象产品类代表不同类型的产品（不同产品等级）
* 具体工厂生产同一产品族的产品，比如格力工厂生产格力系列的产品（格力冰箱、格力空调），海尔工厂生产海尔系列的产品（海尔冰箱、海尔空调）
* @author:hzyuan@iflytek.com 
* @date:2019年6月26日
*
 */
public class Client {
	public static void main(String[] args) {
		HouseElecFactory houseElecFactory1 = new HaierFactory();
		Fridge haierFridge = houseElecFactory1.buildFridge();
		AirCondition  haierAirCondition = houseElecFactory1.buildAirCondition();
		
		haierFridge.freeze();
		haierAirCondition.fresh();
		
		
		HouseElecFactory houseElecFactory2 = new GeLiFactory();
		Fridge geliFridge = houseElecFactory2.buildFridge();
		AirCondition geliAirCondition = houseElecFactory2.buildAirCondition();
		
		geliFridge.freeze();
        geliAirCondition.fresh();
	}
}
