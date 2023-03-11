package com.xworkz.lambda.app.multification;

import com.xworkz.lambda.app.addition.Addition;

public class MultificationTester {

	public static void main(String[] args) {
		
		Multification multification=(num1,num2)->System.out.println(num1 * num2);
		
		multification.multification(20,20);
	}
		
	}

