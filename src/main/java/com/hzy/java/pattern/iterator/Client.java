package com.hzy.java.pattern.iterator;
/**
 * 
* @ClassName:Client 
* @Description:迭代器模式 提供一种方法访问一个容器对象中各个元素，而又不需暴露该对象的内部细节
* 角色：迭代器接口、迭代器具体实现、抽象容器、具体容器
* @author:hzyuan@iflytek.com 
* @date:2019年5月21日
*
 */
public class Client {
	public static void main(String[] args) {
        //创建一个自定义容器，直接使用ArrayList的实现，仅仅示例作用
        Container strContainer = new MyContainer();
        strContainer.put("001");
        strContainer.put("002");
        strContainer.put("003");
        
        Iterator myIterator = strContainer.iterator();
        //使用举例
        System.out.println("------------------next、hasNext示例------------------");
        System.out.println(myIterator.first());
        System.out.println(myIterator.next());
        System.out.println(myIterator.hasNext());
        System.out.println(myIterator.next());
        System.out.println(myIterator.hasNext());
        System.out.println(myIterator.next());
        System.out.println(myIterator.hasNext());
        
        //使用举例
        System.out.println("------------------previous、hasNext示例------------------");
        System.out.println(myIterator.previous());
        System.out.println(myIterator.previous());
        System.out.println(myIterator.previous());
        System.out.println(myIterator.hasNext());
        
        //使用迭代器遍历
        System.out.println("------------------迭代器遍历示例------------------");
        System.out.println(myIterator.first());
        while(myIterator.hasNext()){
            System.out.println(myIterator.next());
        }
    }
}
