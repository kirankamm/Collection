package com.xworkz.imp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.xworkz.app.bto.SalesPersonDTO;

public class DistributorImpl implements Distributor {

	List<SalesPersonDTO> salesPersons;
	
	public DistributorImpl() {
		
		
		salesPersons =new ArrayList<SalesPersonDTO>();
	}
	@Override
	public boolean addSalesPerson(SalesPersonDTO dto) throws Exception {
		
		System.out.println("Inside addSallesPerson() with SalesPersonDTO as a para");
		boolean isAdded=false;
		
		if(dto !=null && dto.getSalesPersonId() >=1 && dto.getPersonName() !=null) {
			salesPersons.add(dto);
			isAdded=true;
			
		}
		else {
			System.out.println("No salesPerson added");
		}
return isAdded;		
	}
	
	
	@Override
	public List<SalesPersonDTO> getAllSalesPersons(){
		
		List<SalesPersonDTO> dtos=new ArrayList<SalesPersonDTO>();
		
		System.out.println("the list of sales persons are: ");
		
		Iterator<SalesPersonDTO> itr=salesPersons.iterator();
		while(itr.hasNext()) {
			dtos.add(itr.next());
		}
		return dtos;
	}
	
	
}
