package com.hzy.java.pattern.factory.abstract_factory;

public class ChineseFamilyFactory implements IFamilyFactory{
	@Override
    public IFather createFather(String name) {
        return new ChineseFather(name);
    }

    @Override
    public IMother createMother(String name) {
        return new ChineseMother(name);
    }
}
