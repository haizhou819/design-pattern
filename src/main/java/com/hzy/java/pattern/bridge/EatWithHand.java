package com.hzy.java.pattern.bridge;

public class EatWithHand implements Eatable{
    @Override
    public void eat() {
        System.out.println("Eat with Hand");
    }
}
