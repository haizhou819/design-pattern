package com.hzy.java.pattern.observer;
/**
 * 
* @ClassName:Observer 
* @Description:抽象观察者
 * 定义了一个update()方法，当被观察者调用notifyObservers()方法时，观察者的update()方法会被回调。
* @author:hzyuan@iflytek.com 
* @date:2019年1月24日
*
 */
public interface Observer {
	public void update(String message);
}
