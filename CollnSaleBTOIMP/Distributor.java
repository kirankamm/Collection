package com.xworkz.imp;

import java.util.List;

import com.xworkz.app.bto.SalesPersonDTO;

public interface Distributor {

	public boolean  addSalesPerson(SalesPersonDTO dto) throws Exception;
	
// not body contains
	
	 public List<SalesPersonDTO> getAllSalesPersons();
	
}
