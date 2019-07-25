package com.hzy.java.pattern.observer.event;
/**
 * 
* @ClassName:Client 观察者模式的应用：java事件机制
* @Description:Java事件机制包括三个部分：事件、事件监听器、事件源。本例中老师（事件源）布置作业（事件）给学生（事件监听器）
* @author:hzyuan@iflytek.com 
* @date:2019年6月27日
*
 */
public class Client {
	public static void main(String[] args) {
		Student student1= new Student("张三");
        Student student2 = new Student("李四");
        Teacher teacher1 = new Teacher("zuikc");
        teacher1.addObserver(student1);
        teacher1.addObserver(student2);
        teacher1.setHomework("事件机制第二天作业");
	}
}
