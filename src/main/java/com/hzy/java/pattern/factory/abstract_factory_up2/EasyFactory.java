package com.hzy.java.pattern.factory.abstract_factory_up2;

public class EasyFactory {
	private static String pkgName = "com.hzy.java.pattern.factory.abstract_factory_up2";
	// 家电品牌
    //private static String trade = "geli";
    private static String trade = "haier";
    
    public static AirCondition getAirCondition() throws InstantiationException, IllegalAccessException, ClassNotFoundException{
    	String className = pkgName + "." + trade + "AirCondition";
		return (AirCondition)Class.forName(className).newInstance();
    }
    
    public static Fridge getFridge() throws InstantiationException, IllegalAccessException, ClassNotFoundException{
    	String className = pkgName + "." + trade + "Fridge";
    	return (Fridge)Class.forName(className).newInstance();
    }
}
