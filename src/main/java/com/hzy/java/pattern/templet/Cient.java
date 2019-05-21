package com.hzy.java.pattern.templet;

public class Cient {
	public static void main(String[] args) {
         Tea tea = new Tea();
         tea.prepareRecipe();
         
         System.out.println("-----------------------");
         
         Coffee coffee = new Coffee();
         coffee.prepareRecipe();
	}
}
