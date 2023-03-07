package com.xworkz.tester;

import java.util.List;
import java.util.Scanner;

import com.xworkz.app.bto.SalesPersonDTO;
import com.xworkz.constant.Gender;
import com.xworkz.imp.Distributor;
import com.xworkz.imp.DistributorImpl;

public class DistributorTester {

	public static void main(String[] args) {
		
		Scanner sc=null;
		try {
		sc=new Scanner(System.in);
			
		Distributor distributor=new DistributorImpl();
 
		
		SalesPersonDTO dto=new SalesPersonDTO();
        System.out.println("Enter the personName");
        dto.setPersonName(sc.next());
		
		System.out.println("Enter the salesPersonId");
        dto.setSalesPersonId(sc.nextInt());
		
		System.out.println("Enter the gender");
        dto.setGender(Gender.valueOf(sc.next()));
		
		System.out.println("Enter the address");
        dto.setAddress(sc.next()); 
		
		System.out.println("Enter the age");
        dto.setAge(sc.nextInt());
		
		System.out.println("Enter the bloodGroup");
        dto.setBloodGroup(sc.next());
        
		distributor.addSalesPerson(dto);
		
		List<SalesPersonDTO> persons =distributor.getAllSalesPersons();
		
		System.out.println( persons);

		
	}catch (Exception e) {
		e.printStackTrace();
	}finally {
		if(sc !=null) {
			sc.close();
	}
}
	}
}









