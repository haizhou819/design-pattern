package com.hzy.java.pattern.adapter.clazz;

import com.hzy.java.pattern.adapter.DC5;

public class Client {
	public static void main(String[] args) {
		DC5 dc5 = new PowerAdapter();
        dc5.output5V();
        System.out.println("得到5V直流电");
	}
}
