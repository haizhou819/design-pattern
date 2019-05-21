package com.hzy.java.pattern.factory.abstract_factory;

public class AmericanFather implements IFather{
	private String name;
    public AmericanFather(String name) {
        this.name = name;
        System.out.println("create a us father.");
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
