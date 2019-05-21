package com.hzy.java.pattern.factory.abstract_factory;

public class AmericanMother implements IMother{
	private String name;
    public AmericanMother(String name) {
        this.name = name;
        System.out.println("create a us mother.");
    }
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public void printName() {
        System.out.println(this.getClass().getName() + ":" + this.name);
        
    }
}
