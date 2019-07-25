package com.hzy.java.pattern.adapter.clazz;

import com.hzy.java.pattern.adapter.AC220;
import com.hzy.java.pattern.adapter.DC5;
/**
 * 
* @ClassName:PowerAdapter 
* @Description:使用继承完成类的适配模式
* @author:hzyuan@iflytek.com 
* @date:2019年5月20日
*
 */
public class PowerAdapter extends AC220 implements DC5 {
    public int output5V() {
        int output = output220V();
        System.out.println("220V交流电转变为5V直流电");
        return (output / 44);
    }
}
