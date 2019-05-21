package com.hzy.java.pattern.visitor;

public class Doctor extends Visitor{

	@Override
	public void visitor(MedicineA a) {
		System.out.println("医生工作者：" + name + "开药 ：" + a.getName());
		
	}

	@Override
	public void visitor(MedicineB b) {
		System.out.println("医生工作者：" + name + "开药 ：" + b.getName());
	}

}
