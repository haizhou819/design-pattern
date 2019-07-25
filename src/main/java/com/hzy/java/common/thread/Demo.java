package com.hzy.java.common.thread;

public class Demo {
	public Object object = new Object();
	
	class ThreadA extends Thread{
		@Override
		public void run() {
			for(int i = 1;i <= 100;i++){
				synchronized(object){
					System.out.print(i);
					System.out.print(",");
					object.notify();
					try {
						if (i == 100) {
							break;
						}
						object.wait();
					} catch (Exception e) {
						e.printStackTrace();
					}
					
				}
			}
		}
	}
	
	class ThreadB extends Thread{
		@Override
		public void run() {
			for(int i = -1;i >= -100;i--){
				synchronized(object){
					System.out.print(i);
					object.notify();
					try {
						if (i == -100) {
							break;
						}else {
							System.out.print(",");
						}
						object.wait();
					} catch (Exception e) {
						e.printStackTrace();
					}
					
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Demo demo = new Demo();
		ThreadA ta = demo.new ThreadA();
		ThreadB tb = demo.new ThreadB();
		ta.start();
		tb.start();
	}
}
