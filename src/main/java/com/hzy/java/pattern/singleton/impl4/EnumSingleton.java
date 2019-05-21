package com.hzy.java.pattern.singleton.impl4;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

//通过枚举实现单例模式避免通过反射攻击单例模式、序列化等问题
public enum EnumSingleton {
	INSTANCE;
	public EnumSingleton getInstance(){
         return INSTANCE;
    }
	
	public static void Test(){
		System.out.println("++++++++++++++");
	}
	
	public static void main(String[] args) throws IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchMethodException {
         EnumSingleton singleton1=EnumSingleton.INSTANCE;
         EnumSingleton singleton2=EnumSingleton.INSTANCE;
         System.out.println("正常情况下，实例化两个实例是否相同："+(singleton1==singleton2));
         EnumSingleton.Test();
         Constructor<EnumSingleton> constructor= null;
         constructor = EnumSingleton.class.getDeclaredConstructor();
         constructor.setAccessible(true);
         EnumSingleton singleton3= null;
         singleton3 = constructor.newInstance();
         System.out.println(singleton1+"\n"+singleton2+"\n"+singleton3);
         System.out.println("通过反射攻击单例模式情况下，实例化两个实例是否相同："+(singleton1==singleton3));
     }
}
