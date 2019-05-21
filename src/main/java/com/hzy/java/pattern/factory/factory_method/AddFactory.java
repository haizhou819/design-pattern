package com.hzy.java.pattern.factory.factory_method;

import com.hzy.java.pattern.factory.simple_factory.Add;
import com.hzy.java.pattern.factory.simple_factory.Operation;

public class AddFactory implements Factory{
    public Operation createOperation() {
        System.out.println("加法运算");
        return new Add();
    }
}
