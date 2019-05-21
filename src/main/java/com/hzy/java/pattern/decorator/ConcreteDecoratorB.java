package com.hzy.java.pattern.decorator;

public class ConcreteDecoratorB extends Decorator{
	public ConcreteDecoratorB(Component component) {
        super(component);
    }

    public void t() {
        System.out.println("wait a memnet");
        this.component.t();
    }

}
