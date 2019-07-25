package com.hzy.java.pattern.observer.event;

public class HomeworkEventObject extends java.util.EventObject{
	private static final long serialVersionUID = 1L;
	public HomeworkEventObject(Object source) {
        super(source);
    }
    public HomeworkEventObject(Teacher teacher) {
        super(teacher);
    }
    public Teacher getTeacher(){
        return (Teacher) super.getSource();
    }
}
