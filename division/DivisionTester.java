package com.xworkz.lambda.app.division;

public class DivisionTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


	Division div=(num1,num2)->
	{
	System.out.println("start of Division method");

	System.out.println(num1 % num2);
	
	System.out.println("end of Division method");
	};
		div.div(6,12);
	}

}
