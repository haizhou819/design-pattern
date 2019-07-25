package com.hzy.java.pattern.adapter.obj;

import com.hzy.java.pattern.adapter.AC220;
import com.hzy.java.pattern.adapter.DC5;
/**
 * 
* @ClassName:PowerAdapter 
* @Description:使用组合完成对象的适配模式
* @author:hzyuan@iflytek.com 
* @date:2019年5月20日
*
 */
public class PowerAdapter implements DC5{
    private AC220 mAC220;

    public PowerAdapter(AC220 ac220){
        this.mAC220 = ac220;
    }

    public int output5V() {
        int output = 0;
        if (mAC220 != null) {
            output = mAC220.output220V() / 44;
        }
        return output;
    }
}
