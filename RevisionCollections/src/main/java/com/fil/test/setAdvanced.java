package com.fil.test;

import java.util.HashSet;
import java.util.Set;

public class setAdvanced {
	
	public static void main(String[] args) {
		
		
		Set<Integer> numSet1 = new HashSet<Integer>();
		Set<Integer> numSet2 = new HashSet<Integer>();
		
		numSet1.add(2);
		numSet1.add(4);
		numSet1.add(6);
		numSet1.add(8);
		

		numSet2.add(1);
		numSet2.add(4);
		numSet2.add(3);
		numSet2.add(9);
	
	
	System.out.println("Set 1 "+ numSet1);
	System.out.println("Set 2 "+ numSet2);
//	numSet1.addAll(numSet2);
//	System.out.println("Union Operation "+ numSet1);
	
//	numSet1.retainAll(numSet2);
//	System.out.println("Intersection Operation "+numSet1);
	
	
	numSet1.removeAll(numSet2);
	System.out.println(" Difference Operation "+numSet1);

	
	}

}
