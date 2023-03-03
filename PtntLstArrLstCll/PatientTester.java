package com.xworkz.patientapp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PatientTester {

	public static void main(String[] args) {
		
		List<Patient> patientRef1=new ArrayList<Patient>();
		
		patientRef1.add(new Patient("kiarn",123,25,7795,"Benglore") );
		patientRef1.add(new Patient("charan",143,26,8884,"Manglore") );

		Iterator<Patient> itrRef1=patientRef1.iterator();
		
		while(itrRef1.hasNext()) {
			
			Patient patientRef2=itrRef1.next();
			
			System.out.println(patientRef2);
		}
		
		
		
	}
}
