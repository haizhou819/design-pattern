package com.hzy.java.pattern.factory.factory_method;

import com.hzy.java.pattern.factory.simple_factory.Operation;

public class Client {
	public static void main(String[] args)  throws Exception{
		// 使用反射机制实例化工厂对象，因为字符串是可以通过变量改变的
        Factory addFactory = (Factory) Class.forName("com.hzy.java.pattern.factory.factory_method.AddFactory").newInstance();
        Factory subFactory=(Factory) Class.forName("com.hzy.java.pattern.factory.factory_method.SubFactory").newInstance();
        Factory mulFactory=(Factory) Class.forName("com.hzy.java.pattern.factory.factory_method.MulFactory").newInstance();
        Factory divFactory=(Factory) Class.forName("com.hzy.java.pattern.factory.factory_method.DivFactory").newInstance();

        // 通过工厂对象创建相应的实例对象
        Operation add = addFactory.createOperation();
        Operation sub = subFactory.createOperation();
        Operation mul = mulFactory.createOperation();
        Operation div = divFactory.createOperation();

        System.out.println(add.getResult(1, 1));
        System.out.println(sub.getResult(1, 1));
        System.out.println(mul.getResult(1, 1));
        System.out.println(div.getResult(1, 1));
    }
}
