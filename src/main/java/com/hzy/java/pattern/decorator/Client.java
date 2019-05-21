package com.hzy.java.pattern.decorator;

public class Client {
	public static void main(String[] args) {
		Component component = new ConcreteDecoratorB(new ConcreteDecoratorC(new ConcretComponent()));
		component.t();
	}
}
