package com.hzy.java.pattern.proto;

import java.util.Date;

public class Client {
	public static void main(String[] args) throws CloneNotSupportedException {
		Date date = new Date();
		Sleep sleep1 = new Sleep("喜洋洋", date);
		
		Sleep sleep2 = (Sleep)sleep1.clone();
		sleep2.name = "红洋洋";
		//sleep2.birthday = new Date(123456L);
		date.setDate(12345);;
		
		System.out.println(sleep1);
		System.out.println(sleep2);
		
		System.out.println(sleep1.name);
		System.out.println(sleep2.name);
		
		System.out.println("喜洋洋的生日：" + sleep1.birthday.toString());
		System.out.println("红洋洋的生日：" + sleep2.birthday.toString());
		
	}
}
