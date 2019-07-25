package com.hzy.java.pattern.adapter.inter;

import com.hzy.java.pattern.adapter.AC220;

public class Client {
	public static void main(String[] args) {
		 // 已经实现了子类
        Power5VAdapter power5VAdapter = new Power5VAdapter(new AC220());
        power5VAdapter.output5V();

        // 直接实现子类
        PowerAdapter powerAdapter = new PowerAdapter(new AC220()) {
            @Override
            public int output5V() {
                int output = 0;
                if (mAC220 != null) {
                    output = mAC220.output220V() / 44;
                    System.out.println("输出直流电5V");
                }
                return output;
            }
        };
        powerAdapter.output5V();
	}
}
