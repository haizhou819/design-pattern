package com.hzy.java.pattern.observer;
/**
 * 
* @ClassName:Observerable 
* @Description:抽象被观察者接口
 * 声明了添加、删除、通知观察者方法
* @author:hzyuan@iflytek.com 
* @date:2019年1月24日
*
 */
public interface Observerable {
	public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObserver();
}
