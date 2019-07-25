package com.hzy.java.pattern.bridge;

public class European extends Person{
    public European(Eatable eatable) {
        this.eatable = eatable;
    }

	@Override
	public void eat() {
		System.out.print("欧洲人开始吃饭了 ");
		eatable.eat();
	}
}
