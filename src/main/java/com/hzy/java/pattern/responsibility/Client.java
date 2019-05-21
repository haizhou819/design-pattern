package com.hzy.java.pattern.responsibility;
/**
 * 
* @ClassName:Client 
* @Description:你找领导报销10000元出差补助，你找了你的直接领导就是部门经理，然后部门经理又只能报销2000以内，然后部门经理拿着你的报销单就去找总监，
* 总监又只能报销5000以下，总监再去找经理，然后报销通过了，这一个过程就阐述了这个模式
* @author:hzyuan@iflytek.com 
* @date:2019年1月24日
*
 */
public class Client {
	public static void main(String[] args) {
		// 列出所有阶级关系
        Manager manager = new Manager(null);
        Director director = new Director(manager);
        GroupLeader groupLeader = new GroupLeader(director);
        groupLeader.handlerRequest(10000);
	}
}
