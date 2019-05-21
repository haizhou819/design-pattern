package com.hzy.java.pattern.singleton.impl1;

import java.lang.reflect.Constructor;

//懒汉方式，使用的时才new
public class Singleton {
	private static volatile Singleton INSTANCE = null; //用volatile修饰避免双重检查异常
	private Singleton(){}//私有化构造方法，防止外部类调用new构造实例
	
	/**
	 * 
	 * @MethodName:getInstance1   
	 * @Description:效率太低了，每个线程在想获得类的实例时候，执行getInstance()方法都要进行同步。
	 * 而其实这个方法只执行一次实例化代码就够了，后面的想获得该类实例，直接return就行了。方法进行同步效率太低要改进。
	 * @return      
	 * @return:Singleton      
	 * @throws
	 */
	public static synchronized Singleton getInstance1() {
		if (INSTANCE == null) {
			INSTANCE = new Singleton();
		}
		return INSTANCE;
	}
	
	/**
	 * 
	 * @MethodName:getInstance2   
	 * @Description:双重检查 ,此时INSTANCE必须由volatile修饰
	 * @return      
	 * @return:Singleton      
	 * @throws
	 */
	public static Singleton getInstance2() {
		if (INSTANCE == null) {
			synchronized(Singleton.class){
				if (INSTANCE == null) {
					INSTANCE = new Singleton();
				}
			}
		}
		return INSTANCE;
	}
	
	public static void main(String[] args) throws  Exception {
		Singleton s1 = Singleton.getInstance2();
		Singleton s2 = Singleton.getInstance2();
		Constructor<Singleton> constructor = Singleton.class.getDeclaredConstructor();
		constructor.setAccessible(true);
		Singleton s3 = constructor.newInstance();
		
		System.out.println(s1==s2);
		System.out.println(s1==s3);
	}
}
