package com.hzy.java.pattern.decorator;
//装饰类
public class Decorator implements Component {
	public Component component;
    
    public Decorator(Component component) {
        this.component = component;
    }
    
    public void t() {
        this.component.t();
    }
}
