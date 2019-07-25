package com.hzy.java.pattern.adapter.obj;

import com.hzy.java.pattern.adapter.AC220;

public class Client {
	public static void main(String[] args) {
		PowerAdapter adapter = new PowerAdapter(new AC220());
        adapter.output5V();
	}
}
