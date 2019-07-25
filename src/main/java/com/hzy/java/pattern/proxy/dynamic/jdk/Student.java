package com.hzy.java.pattern.proxy.dynamic.jdk;

public class Student implements Person {
	private String name;
    public Student(String name) {
        this.name = name;
    }
    
	public void giveMoney() {
		try {
	        //假设数钱花了一秒时间
	        Thread.sleep(1000);
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
	    System.out.println(name + "上交班费50元");
	}

	public void getBooks() {
		try {
	        //假设数钱花了一秒时间
	        Thread.sleep(1000);
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
	    System.out.println(name + "领到3本书");
	}
}
