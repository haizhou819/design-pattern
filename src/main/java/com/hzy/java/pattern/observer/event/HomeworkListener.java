package com.hzy.java.pattern.observer.event;

public interface HomeworkListener extends java.util.EventListener{
	public void update(HomeworkEventObject o, Object arg);
}
