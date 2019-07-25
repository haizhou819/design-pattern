package com.hzy.java.pattern.proto;

import java.util.Date;

public class Sleep implements Cloneable{
	public String name;
	public Date birthday;
	
	public Sleep(String name ,Date birthday){
		this.name = name;
		this.birthday = birthday;
	}
	
	//浅克隆
	protected Object clone() throws CloneNotSupportedException{
		Object object = super.clone();
		return object;
	}
	
	//深克隆
	/*protected Object clone() throws CloneNotSupportedException{
		Object object = super.clone();
		Sleep sleep = (Sleep)object;
		sleep.birthday = (Date)sleep.birthday.clone();
		return object;
	}*/
}
