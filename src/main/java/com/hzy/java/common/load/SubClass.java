package com.hzy.java.common.load;

public class SubClass extends SuperClass{
	static final int b;
	static
    {
        System.out.println("SubClass init");
        b = 3;
        System.out.println(b);
    }
 
    static int a = 19;
 
    public SubClass()
    {
        System.out.println("init SubClass");
    }
    
   
}
