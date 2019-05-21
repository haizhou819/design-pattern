package com.hzy.java.pattern.factory.simple_factory;

public class Add implements Operation{

    // 加法计算
    public double getResult(double numberA, double numberB) {

        return numberA + numberB;
    }
}
