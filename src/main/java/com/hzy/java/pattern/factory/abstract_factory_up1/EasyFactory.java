package com.hzy.java.pattern.factory.abstract_factory_up1;

public class EasyFactory {
	// 家电品牌
    //private static String trade = "geli";
    private static String trade = "haier";
    
    public static AirCondition getAirCondition(){
    	switch (trade) {
		case "geli":
			return new GeLiAirCondition();
		case "haier":
			return new HaierAirCondition();
		default:
			return null;
		}
    }
    
    public static Fridge getFridge(){
    	switch (trade) {
		case "geli":
			return new GeLiFridge();
		case "haier":
			return new HaierFridge();
		default:
			return null;
		}
    }
}
