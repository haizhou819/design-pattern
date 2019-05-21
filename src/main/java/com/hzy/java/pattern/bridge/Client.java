package com.hzy.java.pattern.bridge;

public class Client {
	public static void main(String[] args) {
        //定义三种具体行为
        Eatable eatWithChopsticks = new EatWithChopsticks();
        Eatable eatWithFork = new EatWithFork();
        Eatable eatWithHand = new EatWithHand();
        
        //定义三种具体人
        Person chinese = new Chinese(eatWithChopsticks);
        Person indian = new Indian(eatWithHand);
        Person european = new European(eatWithFork);
        
        //中国人用筷子吃，印度人用手，欧洲人用叉子
        chinese.getEatable().eat();
        indian.getEatable().eat();
        european.getEatable().eat();
        
        //当然，中国人有时候也用叉子吃西餐，或用手吃
        chinese.setEatable(eatWithFork);
        chinese.getEatable().eat();
        chinese.setEatable(eatWithHand);
        chinese.getEatable().eat();
    }
}
