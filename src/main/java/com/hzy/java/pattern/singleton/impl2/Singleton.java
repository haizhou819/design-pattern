package com.hzy.java.pattern.singleton.impl2;
//饿汉模式
public class Singleton {
	/**
	 * 优点：写法简单，类装载的时候就完成实例化，避免了线程同步问题。
	 * 缺点：在类装载的时候就完成实例化，没有达到Lazy Loading的效果。如果从始至终从未使用过这个实例，则会造成内存的浪费。
	 */
	private static final Singleton INSTANCE = new Singleton();
	private Singleton(){}
	
	public static Singleton getInstance(){
		return INSTANCE;
	}
}
