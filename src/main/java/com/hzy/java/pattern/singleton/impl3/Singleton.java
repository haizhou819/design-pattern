package com.hzy.java.pattern.singleton.impl3;

//内部类方式
public class Singleton {
	private Singleton(){}
	
	public static Singleton getInstance(){
		return SingletonClass.INSTANCE;
	}
	
	private static class SingletonClass{
		private static final Singleton INSTANCE = new Singleton();
	}
}
