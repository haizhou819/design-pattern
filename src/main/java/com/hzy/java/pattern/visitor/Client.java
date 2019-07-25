package com.hzy.java.pattern.visitor;
/**
 * 
* @ClassName:Client 
* @Description:访问者模式 在不修改已有程序结构的前提下，通过添加额外的“访问者”来完成对已有代码功能的提升
* 角色：抽象访问者、具体访问者、抽象元素、具体元素、对象结构（能枚举它的内部元素，允许访问者访问它的元素）
* @author:hzyuan@iflytek.com 
* @date:2019年5月21日
*
 */
public class Client {
	public static void main(String[] args) {
		Medicine a = new MedicineA("板蓝根", 11.0);
        Medicine b = new MedicineB("感康", 14.3);
        
        Visitor charger = new Charger();
        charger.setName("张三");
        
        Visitor workerOfPharmacy = new WorkerOfPharmacy();
        workerOfPharmacy.setName("李四");
        
        Visitor doctor = new Doctor();
        doctor.setName("王五");
        
        Presciption presciption = new Presciption();
        presciption.addMedicine(a);
        presciption.addMedicine(b);
        
        System.out.println("-------------------------------------");
        presciption.accept(charger);
        System.out.println("-------------------------------------");
        presciption.accept(workerOfPharmacy);
        System.out.println("-------------------------------------");
        presciption.accept(doctor);
	}
}
