package com.hzy.java.pattern.factory.factory_method;

import com.hzy.java.pattern.factory.simple_factory.Div;
import com.hzy.java.pattern.factory.simple_factory.Operation;

public class DivFactory implements Factory{
    public Operation createOperation() {
        System.out.println("除法运算");
        return new Div();
    }
}
