package com.test.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamsAPI {

	
	// Stream API is used to process objects from a collection
	public static void main(String[] args) {

		/* Even number using Filter
		 * List<Integer> num = new ArrayList<Integer>();
		 * num.addAll(Arrays.asList(2,4,5,78,6,7,11,3));
		 * 
		 * num.stream().filter(n->n%2 == 0).sorted().forEach(n->System.out.println(n));
		 * 
		 * List<Integer> evenNum = new ArrayList<Integer>();
		 * evenNum=num.stream().filter(n->n%2 ==
		 * 0).sorted().collect(Collectors.toList()); System.out.println(evenNum);
		 */
		
		List<String> students = new ArrayList<String>();
		students = Arrays.asList("Mohan","Sohan","Raj","Tina","Ram");
		
		students.stream().filter(stud-> (stud.length()>3 && stud.length()<5)).forEach(st->System.out.println(st));
		
		
		
		
	}

}
