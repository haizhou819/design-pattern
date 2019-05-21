package com.hzy.java.pattern.iterator;

public interface Iterator {
	public Object first();
    
    public Object previous();
    
    public Object next();

    public boolean hasNext();
}
