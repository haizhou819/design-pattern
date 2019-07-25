package com.hzy.java.pattern.observer;
/**
 * 
 * 
 * 一对多的关系，又叫发布-订阅模式，即一个对象的状态发生变化，所有依赖它的对象能够知道该变化并自动更新
* @ClassName:Client 
* @Description:有一个微信公众号服务，不定时发布一些消息，关注公众号就可以收到推送消息，取消关注就收不到推送消息。
* @author:hzyuan@iflytek.com 
* @date:2019年1月24日
*
 */
public class Client {
	public static void main(String[] args) {
		WechatServer server = new WechatServer();//被观察者
        
        Observer userZhang = new User("ZhangSan");//观察者ZhangSan、LiSi、WangWu
        Observer userLi = new User("LiSi");
        Observer userWang = new User("WangWu");
        
        server.registerObserver(userZhang);
        server.registerObserver(userLi);
        server.registerObserver(userWang);
        server.setInfomation("PHP是世界上最好用的语言！");
        
        System.out.println("----------------------------------------------");
        server.removeObserver(userZhang);
        server.setInfomation("JAVA是世界上最好用的语言！");
	}
}
