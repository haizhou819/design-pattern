package com.hzy.java.common.load;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class MyClassLoader extends ClassLoader{
	private String root;

    protected Class<?> findClass(String name) throws ClassNotFoundException {
        byte[] classData = loadClassData(name);
        if (classData == null) {
            throw new ClassNotFoundException();
        } else {
            return defineClass(name, classData, 0, classData.length);
        }
    }

    private byte[] loadClassData(String className) {
        String fileName = root + File.separatorChar
                + className.replace('.', File.separatorChar) + ".class";
        try {
            InputStream ins = new FileInputStream(fileName);
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            int bufferSize = 1024;
            byte[] buffer = new byte[bufferSize];
            int length = 0;
            while ((length = ins.read(buffer)) != -1) {
                baos.write(buffer, 0, length);
            }
            return baos.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public String getRoot() {
        return root;
    }

    public void setRoot(String root) {
        this.root = root;
    }

    public static void main(String[] args) throws ClassNotFoundException  {
        MyClassLoader classLoader = new MyClassLoader();
        Class<?> t1 = classLoader.getClass();
        Class<?> t2 = MyClassLoader.class;
        Class<?> t3 = Class.forName("com.hzy.java.common.load.MyClassLoader");
        ClassLoader cLoader = Thread.currentThread().getContextClassLoader();
        Class<?> t4 = cLoader.loadClass("com.hzy.java.common.load.MyClassLoader");
        System.out.println(t1.equals(t2));
        System.out.println(t1.equals(t3));
        System.out.println(t1.equals(t4));
        classLoader.setRoot("E:\\Temp");

        Class<?> testClass = null;
        try {
            //testClass = classLoader.loadClass("com.hzy.java.common.load.Test2");
            Class<?> test2 = Test2.class;
            System.out.println(testClass);
            System.out.println(test2);
            System.out.println(test2.equals(testClass));
          //  Object object = testClass.newInstance();
           // System.out.println(object.getClass().getClassLoader());
            Object object2 = test2.newInstance();
            
        /*} catch (ClassNotFoundException e) {
            e.printStackTrace();
        }*/ }catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
