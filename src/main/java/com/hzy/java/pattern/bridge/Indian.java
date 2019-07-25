package com.hzy.java.pattern.bridge;

public class Indian extends Person{
    public Indian(Eatable eatable) {
        this.eatable = eatable;
    }

	@Override
	public void eat() {
		System.out.print("印度人开始吃饭了 ");
		eatable.eat();
	}
}
