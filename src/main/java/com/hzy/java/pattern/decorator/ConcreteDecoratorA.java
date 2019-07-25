package com.hzy.java.pattern.decorator;
//具体装饰类
public class ConcreteDecoratorA extends Decorator{
	public ConcreteDecoratorA(Component component) {
        super(component);
    }

    public void t() {
        System.out.println("ready?go!");
        this.component.t();
    }
}
