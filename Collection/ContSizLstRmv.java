package com.xworkz.collectionapp;


//its come from java.util class
import java.util.ArrayList;
import java.util.Collection;

public class ContSizLstRmv {

	public static void main(String[] args) {
		
	Collection list=new ArrayList();
	
	list.add("babu");
	list.add("zebra");
	list.add("aane");
	list.add("viman");
	list.add("60");
	
	
	System.out.println(list.contains("kiran"));
	System.out.println("the size of the before  using removing "+list.size());
	System.out.println(list);

	System.out.println(list.remove("babu"));
	//string long int   10exa remove size empy r not
	System.out.println("the size of the after  using removing "+ list.size());
	System.out.println(list);
	
}
}


