package com.hzy.java.pattern.factory.abstract_factory;

public class AmericanFamilyFactory implements IFamilyFactory{
	@Override
    public IFather createFather(String name) {
        return new AmericanFather(name);
    }

    @Override
    public IMother createMother(String name) {
        return new AmericanMother(name);
    }

}
