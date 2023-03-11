package com.xworkz.lambda.app.addition;

public class AdditionTester {
	
public static void main(String[] args) {
	
	
	Addition add=(num1,num2)->System.out.println(num1+num2);
	
	add.add(20,20);
}
}
