package com.hzy.java.pattern.adapter.inter;

import com.hzy.java.pattern.adapter.AC220;

public abstract class PowerAdapter implements DCOutput{
    protected AC220 mAC220;

    public PowerAdapter(AC220 ac220){
        this.mAC220 = ac220;
    }

    public int output5V() {
        return mAC220.output220V();
    }

    public int output9V() {
        return mAC220.output220V();
    }

    public int output12V() {
        return mAC220.output220V();
    }

    public int output24V() {
        return mAC220.output220V();
    }

}
