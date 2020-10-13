package com.test.array;

import java.util.*;

public class CollectionsDemo {
	public static void main(String[] args) {
		// ArrayList
		List<String> a1 = new ArrayList<String>();
		a1.add("Danylo");
		a1.add("Helene");
		a1.add("Ivan");
		a1.add("Alexa");
		System.out.println("ArrayList Elements");
		System.out.println(a1);
		System.out.println("-----------------------------------------------------");

		// LinkedList
		List<String> l1 = new LinkedList<String>();
		l1.add("Danylo");
		l1.add("Helene");
		l1.add("Ivan");
		l1.add("Alexa");
		System.out.println();
		System.out.println("LinkedList Elements");
		System.out.println(l1);
		System.out.println("-----------------------------------------------------");

		// HashSet
		Set<String> s1 = new HashSet<String>();
		s1.add("Danylo");
		s1.add("Helene");
		s1.add("Ivan");
		s1.add("Alexa");
		System.out.println();
		System.out.println("Set Elements");
		System.out.println(s1);
		System.out.println("-----------------------------------------------------");

		// HashMap
		Map<String, String> m1 = new HashMap<String, String>();
		m1.put("Danylo", "29");
		m1.put("Ivan", "23");
		m1.put("Helene", "30");
		m1.put("Alexa", "22");
		System.out.println();
		System.out.println("Map Elements");
		System.out.println(m1);
		System.out.println("-----------------------------------------------------");

		// Vector
		Vector<String> v = new Vector<String>();
		v.add("Danylo");
		v.add("Helene");
		v.add("Ivan");
		v.add("Alexa");
		System.out.println();
		System.out.println("Vector Elements");
		System.out.println(v);
//		Iterator<String> itr = v.iterator();
//		while (itr.hasNext()) {
//			System.out.println(itr.next());
//		}
		System.out.println();
		System.out.println("-----------------------------------------------------");

		ArrayList<String> list = new ArrayList<String>();// Creating arraylist
		list.add("Danylo");// Adding object in arraylist
		list.add("Helene");
		list.add("Ivan");
		list.add("Alexa");

		System.out.println("Traversing list through List Iterator:");
		// Here, element iterates in reverse order
		ListIterator<String> list1 = list.listIterator(list.size());
		while (list1.hasPrevious()) {
			String str = list1.previous();
			System.out.println(str);
		}
		System.out.println("-----------------------------------------------------");
		System.out.println("Traversing list through for loop:");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("-----------------------------------------------------");
		System.out.println("Traversing list through forEach() method:");
		// The forEach() method is a new feature, introduced in Java 8.
		list.forEach(a -> { // Here, we are using lambda expression
			System.out.println(a);
		});

		System.out.println("-----------------------------------------------------");
		System.out.println("Traversing list through forEachRemaining() method:");
		Iterator<String> itr = list.iterator();
		itr.forEachRemaining(a -> // Here, we are using lambda expression
		{
			System.out.println(a);
		});

		System.out.println("-----------------------------------------------------");
		ArrayList<String> al = new ArrayList<String>();
		System.out.println("Is ArrayList Empty: " + al.isEmpty());
		al.add("Danylo");
		al.add("Helene");
		al.add("Ivan");
		al.add("Alexa");
		System.out.println("After Insertion");
		System.out.println("Is ArrayList Empty: " + al.isEmpty());
	}
}
