package com.fil.test;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class mapPractice {

	public static void main(String[] args) {

		
//		Map<String,String> employee = new HashMap<String,String>();
		// To preserve insertion order use Linked HashMap
		Map<String,String> employee = new LinkedHashMap<String,String>();

		employee.put("Name", "Madan Nautiyal");
		employee.put("Department", "Technology");
		employee.put("Salary","100000");
		employee.put("Designation","Manager");
		
		System.out.println(employee);
		
		Set<String> empattributes =employee.keySet();
		for(String empattr:empattributes) {
			
			System.out.println(empattr+"  "+employee.get(empattr));
		}
		
		
	System.out.println("********* Iterating over map **********");
		// Using Iterator in Map
		Set<Entry<String, String>> empItr = employee.entrySet();

	   for(Entry<String, String> entry:empItr) {
		  
		   System.out.println( entry.getKey() +" "+ entry.getValue());
		   
	   }
	
	
	}

}
