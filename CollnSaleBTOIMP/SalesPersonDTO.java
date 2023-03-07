package com.xworkz.app.bto;

import java.io.Serializable;

import com.xworkz.constant.Gender;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class SalesPersonDTO implements Serializable  {

	private String personName;
	private int salesPersonId;
	private String gender;
	private String address;
	private int age;
	private String bloodGroup;
	public void setGender(Gender valueOf) {
		// TODO Auto-generated method stub
		
	}
	
}