package com.fil.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListPractice {
	
	public static void main(String[] args) {
		
		String [] employees = {"Madan","Rohan","Sohan","Mohan"};
		List<String> employee = new ArrayList<String>();
		employee = Arrays.asList(employees);
		
		for(String empName:employee) {
			System.out.println(empName);
		}
		
		employee.stream().forEach(stname -> System.out.println(stname.toLowerCase()));
	}

}
