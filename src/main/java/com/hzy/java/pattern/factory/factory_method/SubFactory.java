package com.hzy.java.pattern.factory.factory_method;

import com.hzy.java.pattern.factory.simple_factory.Operation;
import com.hzy.java.pattern.factory.simple_factory.Sub;

public class SubFactory implements Factory{
    public Operation createOperation() {
        System.out.println("减法运算");
        return new Sub();
    }
}
