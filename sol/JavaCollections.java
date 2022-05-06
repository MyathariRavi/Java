package com.sol;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class JavaCollections {
	
	public static void main(String[] args) {
		
		//For Collections we have to use 
//		List
		/*
		 * List is an interface posses some methods like add,remove,indexOf etc
		 * ArrayList is class which implemets List Interface
		 */
		
		List list = new ArrayList();
		list.add(1);
		list.add("2");
		list.add(true);
		System.out.println("true index in list is "+list.indexOf(true));
		System.out.println("Does List contains element int 1..?"+list.contains(1));
		list.remove(0);
		System.out.println("Does List contains element int 1..?"+list.contains(1));

		

//		Set 
//		Hashset
		/*
		 *Set is Base Utility for HashSet
		 * set is used for storing unique elements
		 */
		
		Set set = new HashSet();
		set.add(1);
		set.add(5);
		set.add(35);
		set.add(35);
		System.out.println("Set is "+set);
		set.clear();
		
		System.out.println("After Clear, Set is "+set);
		
		Map<Integer,String> map = new HashMap<>(); 
		/*
		 * Map{
		 * key=Value
		 * }
		 * In map keys are Distinct.
		 */
		map.put(1, "A");
		map.put(2, "B");
		map.put(3, "C");
		System.out.println("Map is "+map);

		map.put(3, "c");// Value is Repalced...
		System.out.println("Now, Map is "+map);
		
		ArrayList<String> arr = new ArrayList<>(Arrays.asList("assad","nicolas","Fredarick","Thanmy","Apoorva","Vibhav","Varthika"));
		
//		Iterator
//		List Iterator
		
		Iterator<String> it = arr.iterator();
		System.out.println("The name stored in Array is... ");
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		

		
	}

}
