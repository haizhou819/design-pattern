package com.hzy.java.pattern.factory.abstract_factory_up1;
/**
 * 
* @ClassName:Client 
* @Description:简单工厂+抽象工厂
* @author:hzyuan@iflytek.com 
* @date:2019年6月27日
*
 */
public class Client {
	public static void main(String[] args) {
		Fridge fridge = EasyFactory.getFridge();
		fridge.freeze();
		
		AirCondition airCondition = EasyFactory.getAirCondition();
		airCondition.fresh();
	}
}
