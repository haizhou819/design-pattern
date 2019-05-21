package com.hzy.java.pattern.factory.factory_method;

import com.hzy.java.pattern.factory.simple_factory.Mul;
import com.hzy.java.pattern.factory.simple_factory.Operation;

public class MulFactory implements Factory{
    public Operation createOperation() {
        System.out.println("乘法运算");
        return new Mul();
    }
}
