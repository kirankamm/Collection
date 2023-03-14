package com.xworkz.lambda.app.substraction;

public class SubstractionTester {
 
	public static void main(String[] args) {
	
		Substraction sub=(num1,num2)->
		{
		System.out.println("start of Substraction method");

		System.out.println(num1-num2);
		
		
		System.out.println("end of Substraction method");
		};
		sub.sub(20,20);
		
	
	}
}
