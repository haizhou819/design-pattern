package com.hzy.java.pattern.proxy.dynamic.cglib;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class CglibProxyInterceptor implements MethodInterceptor{
	private Object target;
	public CglibProxyInterceptor(Object target){
		this.target = target;
	}
	public Object getInstance(){
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(target.getClass());
		enhancer.setCallback(this);
		return enhancer.create();
	}
	public Object intercept(Object object, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
		System.out.println("买房前准备");
		//Object result = method.invoke(target, args);
		Object result = methodProxy.invokeSuper(object, args);
		System.out.println("买房后装修");
		return result;
	}
}
