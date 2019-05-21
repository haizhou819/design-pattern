package com.hzy.java.pattern.factory.simple_factory;
/**
 * 
* @ClassName:Client 
* @Description:简单工厂模式不是23种设计模式之一 
* @author:hzyuan@iflytek.com 
* @date:2019年1月27日
*
 */
public class Client {
	public static void main(String[] args)throws Exception {
		Operation add = SimpleFactory.createOperation("+");
        Operation sub = SimpleFactory.createOperation("-");
        Operation mul = SimpleFactory.createOperation("*");
        Operation div = SimpleFactory.createOperation("/");

        System.out.println(add.getResult(1, 1));
        System.out.println(sub.getResult(1, 1));
        System.out.println(mul.getResult(1, 1));
        System.out.println(div.getResult(1, 1));
	}
}
