package com.hzy.java.pattern.factory.abstract_factory;

public class Client {
	 public static void main(String[] args) {
	        IFamilyFactory cnFamilyFactory = new ChineseFamilyFactory();
	        IFamilyFactory usFamilyFactory = new AmericanFamilyFactory();
	        
	        IFather cnFather = cnFamilyFactory.createFather("cn father-test");
	        IMother cnMother = cnFamilyFactory.createMother("cn mother-test");
	        
	        IFather usFather = usFamilyFactory.createFather("us father-test");
	        IMother usMother = usFamilyFactory.createMother("us mother-test");
	        
	        cnFather.printName();
	        cnMother.printName();
	        usFather.printName();
	        usMother.printName();
	    }
}
