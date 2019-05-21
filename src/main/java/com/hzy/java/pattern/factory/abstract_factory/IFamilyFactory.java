package com.hzy.java.pattern.factory.abstract_factory;

public interface IFamilyFactory {
	public IFather createFather(String name);
    public IMother createMother(String name);
}
