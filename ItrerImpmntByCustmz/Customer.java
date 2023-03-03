package com.xworkz.customerapp;

import lombok.AllArgsConstructor;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor//Default Constructor ==purpose
@AllArgsConstructor //variable has to take automatic

public class Customer implements Comparable<Customer> {

    private String customerName;
	private int customerId;
	private int customerMobileNo;
	private String customerPlace;
	private int customerAge;

	

	
	@Override
	public String toString() {
			
	return"Customer (customerName="+this.customerName+",customerId="+this.customerId+",customerMobileNo="+this.customerMobileNo+",customerPlace="+this.customerPlace+",customerAge="+this.customerAge+")";
	}

	public int comparableTo (Customer o) {
		
		return this.customerId-o.customerId;
	}

	@Override
	public int compareTo(Customer o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
