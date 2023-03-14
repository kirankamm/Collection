package com.xworkz.lambda.app.addition;

public class AdditionTester {
	
public static void main(String[] args) {
	
	
	Addition add=(num1,num2)->
	{
	System.out.println("start of add method");
	System.out.println(num1+num2);
	System.out.println("end of add method");
	};
	add.add(20,20);
}
}
