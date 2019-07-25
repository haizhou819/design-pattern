package com.hzy.java.common.sync;
/**
 * 
* @ClassName:Hello 
* @Description:内部锁是可重入锁,若不是可重入的，主线程将会死锁。当调用helloB函数前会先获取内置锁，
* 然后打印输出，然后调用helloA方法，调用前会先去获取内置锁，如果内置锁不是可重入的那么该调用就会导致死锁了，
* 因为线程持有并等待了锁导致helloB永远不会获取内置锁。
* @author:hzyuan@iflytek.com 
* @date:2019年1月14日
*
 */
public class Hello {
	public synchronized void helloA(){
        System.out.println("hello A");
     }

     public synchronized void helloB(){
        System.out.println("hello B");
        helloA();
     }	
     
     public static void main(String[] args) {
		new Hello().helloB();
	}
}
