package com.xworkz.collectionapp;

import java.util.ArrayList;
import java.util.Collection;

public class AddListRemove {

	
	public static void main(String[] args) {
		
		Collection list=new ArrayList();
		
	list.add("kiran");	
	list.add("somu");	
	list.add("liki");	
	list.add("vijay");	
	list.add("pen");	
	list.add("book");	
	list.add("liki");	
	list.add("dog");	
	list.add("cat");	
	list.add("raj");	
	list.add(10 );	
	list.add(20 );	
	list.add(30 );	
	list.add(40 );	
	list.add(50 );	
	list.add(60 );	
	list.add(70);	
	list.add(80);	
	list.add(20);	
	list.add(10);	
	list.add(123123);	
	list.add(456456);	
	list.add(789789);	
	list.add(112233);	
	list.add(445566);	
	list.add(778899);	
	list.add(143143);	
    list.add(123123);
    list.add(456456);
    list.add(789789);
 
    
    
    
    
System.out.println(list.contains("uppi"));

System.out.println("the size of collection  before using remove is "+list.size());
System.out.println(list);


System.out.println(list.remove("kiran"));


System.out.println("the size of collection  after using remove is "+list.size());
System.out.println(list);
		
    System.out.println(list.isEmpty());
	
	

    
    
	System.out.println(list.contains("ramachari"));	
	
	System.out.println(" the size of collection before using remove is"+list.size());
	System.out.println(list);

	
	System.out.println(list.remove("somu"));
	
	
	System.out.println("the size of collection after using remove is"+list.size());
    System.out.println(list);
    
    System.out.println(list.isEmpty());
	
	
	
	
	
	

	
	}
}
