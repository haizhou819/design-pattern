package com.hzy.java.pattern.adapter.inter;

import com.hzy.java.pattern.adapter.AC220;

public class Power5VAdapter extends PowerAdapter {
    public Power5VAdapter(AC220 ac220) {
        super(ac220);
    }

    public int output5V() {
        int output = 0;
        if (mAC220 != null) {
            output = mAC220.output220V() / 44;
            System.out.println("输出直流电5V");
        }
        return output;
    }
}
