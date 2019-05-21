package com.hzy.java.pattern.factory.simple_factory;

public class Sub implements Operation{
    // 减法计算
    public double getResult(double numberA, double numberB) {
        return numberA-numberB;
    }
}
