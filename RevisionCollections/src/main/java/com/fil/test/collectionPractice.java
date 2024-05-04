package com.fil.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class collectionPractice {

	public static void main(String[] args) {

		List<String> students = new ArrayList<String>();
		students.add("Madan Nautiyal");
		students.add("Rohan Kumar");
		students.add("Amit Nautiyal");

		System.out.println(students);

		Collections.sort(students);
		System.out.println(students);

		System.out.println("+++++ Using for each ++++++++++++++++++");
		for (String name : students) {
			System.out.println(name + " " + name.replace(" ", ""));
		}

		System.out.println("+++++ Using Iterator ++++++++++++++++++");

		Iterator<String> stuItr = students.iterator();
		while (stuItr.hasNext()) {
			System.out.println(stuItr.next());
		}
		
		System.out.println("+++++ Using for next ++++++++++++++++++");
		
		for(int i=0;i<students.size();i++) {
			System.out.println( i+1 + " " +students.get(i));
			
		}


	}

}
