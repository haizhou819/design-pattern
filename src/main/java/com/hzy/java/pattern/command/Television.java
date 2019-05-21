package com.hzy.java.pattern.command;

public class Television {
	private String owner;
	
	public Television(String owner){
		this.owner = owner;
	}
    public void open(){
        System.out.println("打开"+owner+"的电视机......");
    }
     
    public void close(){
         System.out.println("关闭"+owner+"的电视机......");        
     }
     
     public void changeChannel(){
         System.out.println("切换"+owner+"的电视频道......");
     }
}
