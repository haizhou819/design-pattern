package com.hzy.java.pattern.facade;
/**
 * 
* @ClassName:Client 
* @Description:外观模式   在子系统中的接口之上定义一个更高层次的接口，方便使用子系统中的接口
* @author:hzyuan@iflytek.com 
* @date:2019年5月21日
*
 */
public class Client {
	public static void main(String[] args) {
         WatchTvSwtichFacade watchTv = new WatchTvSwtichFacade();
         watchTv.on();
         System.out.println("--------------可以看电视了.........");
         watchTv.off();
         System.out.println("--------------可以睡觉了...........");
         
         //不使用外观模式的情况
         Light light = new Light();
         AirCondition ac = new AirCondition();
         Television tv = new Television();
         Screen screen = new Screen();
         light.on();
         ac.on();
         screen.down();
         tv.on();
         System.out.println("--------------可以看电视了.........");
	}
}
