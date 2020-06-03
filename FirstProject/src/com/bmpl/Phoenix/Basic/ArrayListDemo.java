package com.bmpl.Phoenix.Basic;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		// arraylist is a dynamic size collection of same type or any type of elements
		// arraylist is a java class (API - Application Programming Interface) created to sort out our problems with fixed width arrays
		// arraylist has got lots of properties and functions as compared to normal array
		// arraylist is a contiguous allocation of memory
		// because internally arraylist is nothing but fixed size arrays only
		// by default arraylist will be of size 10 elements
		// when you insert more than 11 elements - before 11th element is inserted,
		// java creates a new array of size - 1.5 * current size -> new size
		// all the elements are copied from old array into new array
		// old array is deleted and the 11th element gets inserted into new array
		
		ArrayList<Object> list = new ArrayList<>(100);
		System.out.println(list.size());
		list.add("1");
		list.add(2);
		list.add( Integer.valueOf(2) );
		list.add(3.0);
		list.add(true);
		list.add( new int[5] );
		list.add("Ram");
		list.add(2);
		list.add( Integer.valueOf(2) );
		list.add(3.0);
		list.add(true);
		list.add( new int[5] );
		list.add(new String[5]);
		System.out.println(list.size());
		
//		int arr[] = new int[100];
//		
//		int arr[] = new int[10];
//		int arr2[] = new int[15];
//		delete arr
//		int arr3[] = new int[22];
//		delete arr2
//		33 -> 49 -> 73 -> 109
		
		System.out.println(list);
		
		list.add(4, 10);
		
		System.out.println(list);
		
		list.set(4, 100);
		
		System.out.println(list);
		
		System.out.println("Element at 0 index is " + list.get(0));
		
		System.out.println(list.contains(101) ? "Element found" : "Element not found");
		
		list.forEach(element -> System.out.println("Element is " + element));
		
		list.forEach(element -> {
			System.out.println("Element is " + element);
			System.out.println("Going to iterate to next element...");
		});
		
//		for(int element : arr) {
//			System.out.println(element);
//		}
		
		System.out.println("100 found at index " + list.indexOf(100));
		
		System.out.println("3.0 found at index " + list.indexOf(3.0));
		
		System.out.println("3.0 found at index " + list.lastIndexOf(3.0));
		
//		list.remove(int index); -> 1, 0
		
//		list.remove(Object o);
		
		list.remove(4);
		
		list.remove(Integer.valueOf(100));
		
		list.remove(3.0);
		
		System.out.println(list);
		
		List<Object> slicedList = list.subList(2,10); // -> data from 2 to 9
		
		System.out.println(slicedList);
		
		System.out.println(list.toString());
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println( list.get(i) );
		}
		
//		list.clear();
//		System.out.println(list);
//		
//		list = null;
//		System.out.println(list);
		
		
		
//		int arr[] = new int[5];
//		arr[4] = 10;
//		arr[4] = 100;
		
		ArrayList<int[]> al = new ArrayList<>();
		
		ArrayList<String[]> courseWiseSubjects = new ArrayList<>();
		
		String medicalStream[] = {"Biology", "Physics", "Chemistry", "Maths", "English"};
		
		String nonMedicalStream[] = {"Physics", "Chemistry", "Maths", "Computer Science", "English", "Physical Education"};
		
		courseWiseSubjects.add(medicalStream);
		
		courseWiseSubjects.add(nonMedicalStream);
		
		System.out.println(courseWiseSubjects);
	}

}
