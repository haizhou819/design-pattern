package com.hzy.java.pattern.bridge;

public class EatWithFork implements Eatable{
    @Override
    public void eat() {
        System.out.println("Eat with Fork");
    }
}
