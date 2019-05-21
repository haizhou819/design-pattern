package com.hzy.java.pattern.adapter;
/**
 * 
* @ClassName:AC220 
* @Description:简单的抽象一个场景：手机充电需要将220V的交流电转化为手机锂电池需要的5V直流电，我们的demo就是写一个电源适配器，将 AC220v ——> DC5V，
* 其实适配器模式可以简单的分为三类：类适配器模式、对象的适配器模式、接口的适配器模式。我们就以这三种模式来实现上述步骤
* @author:hzyuan@iflytek.com 
* @date:2019年1月24日
*
 */
public class AC220 {
	public int output220V(){
        int output = 220;
        System.out.println("产生220V交流电");
        return output;
    }
}
