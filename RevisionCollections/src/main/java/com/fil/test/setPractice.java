package com.fil.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class setPractice {

	public static void main(String[] args) {

		
		Set<String> countries = new HashSet<String>();
		countries.add("India");
		countries.add("China");
		countries.add("Russia");
		countries.add("France");
	
		// 
		System.out.println("******using for each***************************");
		for(String country:countries) {
			System.out.println(country.toUpperCase());
			
		}
		
		System.out.println("******using Iterator***************************");
        Iterator<String> countryItr = countries.iterator();
        while (countryItr.hasNext()) {
        	System.out.println(countryItr.next());
        }
        
        List<String> countryList = new ArrayList<String>();
        countryList.addAll(countries);
        
        Collections.sort(countryList);
        countries.clear();
        countries.addAll(countryList);
        
        System.out.println("***************Sorted Set *********");
        System.out.println(countries);
        
        
        
        
	}

}
