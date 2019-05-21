package com.hzy.java.pattern.factory.simple_factory;

public class Mul implements Operation{
    // 乘法计算
    public double getResult(double numberA, double numberB) {
        return numberA * numberB;
    }
}
