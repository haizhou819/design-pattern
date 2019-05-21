package com.hzy.java.pattern.bridge;

public class EatWithChopsticks implements Eatable{
    @Override
    public void eat() {
        System.out.println("Eat with Chopsticks");
    }
}
