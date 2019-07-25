package com.hzy.java.pattern.observer.event;

public class Student implements HomeworkListener{
	private String name;
    public Student(String name){
        this.name = name;
    }
    @Override
    public void update(HomeworkEventObject o, Object arg) {
        Teacher teacher = o.getTeacher();
        System.out.printf("学生%s观察到（实际是被通知）%s布置了作业《%s》 \n", this.name, teacher.getName(), arg);
    }
}
