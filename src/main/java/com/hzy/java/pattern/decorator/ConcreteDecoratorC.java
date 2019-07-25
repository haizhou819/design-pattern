package com.hzy.java.pattern.decorator;

public class ConcreteDecoratorC extends Decorator{
	public ConcreteDecoratorC(Component component) {
        super(component);
    }

    public void t() {
        System.out.println("have a rest!");
        this.component.t();
    }
}
