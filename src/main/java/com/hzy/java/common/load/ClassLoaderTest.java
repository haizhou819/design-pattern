package com.hzy.java.common.load;

public class ClassLoaderTest {
	public static void main(String[] args) throws ClassNotFoundException {
		test2();
    }
	
	public static void test1() {
		ClassLoader loader = Thread.currentThread().getContextClassLoader();
        System.out.println(loader);
        System.out.println(loader.getParent());
        System.out.println(loader.getParent().getParent());
	}
	
	public static void test2() throws ClassNotFoundException {
		ClassLoader loader = ClassLoaderTest.class.getClassLoader(); 
        System.out.println(loader); 
        //使用ClassLoader.loadClass()来加载类，不会执行初始化块 
        loader.loadClass("com.hzy.java.common.load.Test2"); 
        //使用Class.forName()来加载类，默认会执行初始化块 
        //Class.forName("com.hzy.java.common.load.Test2"); 
        //使用Class.forName()来加载类，并指定ClassLoader，初始化时可控是否执行静态块 ，false不执行，true执行
        Class.forName("com.hzy.java.common.load.Test2", true, loader); 
	}
}
