package com.test.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionsDemo {
	public static void main(String[] args) {
		// ArrayList
		List<String> a1 = new ArrayList<String>();
		a1.add("Danylo");
		a1.add("Helene");
		a1.add("Ivan");
		a1.add("Alexa");
		System.out.println("ArrayList Elements");
		System.out.print("\t" + a1);

		// LinkedList
		List<String> l1 = new LinkedList<String>();
		l1.add("Danylo");
		l1.add("Helene");
		l1.add("Ivan");  
		l1.add("Alexa"); 
		System.out.println();
		System.out.println("LinkedList Elements");
		System.out.print("\t" + l1);

		// HashSet
		Set<String> s1 = new HashSet<String>();
		s1.add("Danylo");
		s1.add("Helene");
		s1.add("Ivan");  
		s1.add("Alexa"); 
		System.out.println();
		System.out.println("Set Elements");
		System.out.print("\t" + s1);

		// HashMap
		Map<String, String> m1 = new HashMap<String, String>();
		m1.put("Danylo", "8");
		m1.put("Mahnaz", "31");
		m1.put("Ivan", "12");
		m1.put("Helene", "14");
		m1.put("Alexa", "1");
		System.out.println();
		System.out.println("Map Elements");
		System.out.print("\t" + m1);
	}
}
