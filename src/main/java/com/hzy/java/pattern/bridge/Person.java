package com.hzy.java.pattern.bridge;

public abstract class Person {
	//吃行为抽象为接口，使之与具体对象解耦
    protected Eatable eatable;

    /**
     * @return the eatable
     */
    public Eatable getEatable() {
        return eatable;
    }

    /**
     * @param eatable the eatable to set
     */
    public void setEatable(Eatable eatable) {
        this.eatable = eatable;
    }
    
    public abstract void eat();
}
