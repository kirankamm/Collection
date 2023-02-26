package com.xworkz.collectionapp;

import java.util.ArrayList;
import java.util.List;

public class GetObjct {

	public static void main(String[] args) {
		
		
		List list=new ArrayList();
		//ArrayList,vecter,LinkedList,stack=it method function we ca use
		//only of this 
		
		   list.add(null);
		   list.add(null);
		   list.add(null);
		   list.add(0,"subjecte");
		   list.add(1,"sun");
		   list.add(2,"moon");
		   
		   System.out.println(list);
		
		   System.out.println(list.get(3));
		   System.out.println(list.get(0));
		   System.out.println(list.get(1));
		   System.out.println(list.get(2));
		   System.out.println(list.get(3));
		   System.out.println(list.get(4));
		   System.out.println(list.get(5));

		   for (Object obj:list) {
	  // list.add(1); run time ocures ..java.util.ConcurrentModificationException
			   System.out.print(obj +", ");
			   
		   }
		   
		   
	//create two list
		   
		   //add them
		   
		   
		   
		
	}
	
	
	
	
}
