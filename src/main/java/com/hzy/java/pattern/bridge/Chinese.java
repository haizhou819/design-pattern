package com.hzy.java.pattern.bridge;

public class Chinese extends Person{
    public Chinese(Eatable eatable) {
        this.eatable = eatable;
    }

	@Override
	public void eat() {
		System.out.print("中国人开始吃饭了 ");
		eatable.eat();
	}
}
