package com.bmpl.Phoenix.Basic;

public class StringsDemo {
	
	public static void main(String[] args) {
		
		String s = "Hello, this is Java Programming";
		
		char letter = s.charAt(0);
		System.out.println(letter);
		
		System.out.println("Ram".compareTo("Shyam"));
		System.out.println("Shyam".compareTo("Ram"));
		System.out.println("Ram".compareTo("shyam"));
		int asciiCodeOfSmallS = 's';
		int asciiCodeOfCapitalR = 'R';
		System.out.println("s is " + asciiCodeOfSmallS);
		System.out.println("R is " + asciiCodeOfCapitalR);
		
		System.out.println("Ram".compareTo("Rohan"));
		System.out.println("Ram".compareTo("Raman"));
		System.out.println("Ram".compareTo("Ramanujan"));
		// When two strings match each other in the beginning and
		// there is no difference until one string ends then
		// java gives output according to length not ascii code
		
		// lexicographically - arrange in dictionary order and then compare the strings
		// ram shyam -> r(18) -> s(19) -> -1
		
		System.out.println("hello".concat("this is java programming"));
		System.out.println("hello"+"this is java programming");
		System.out.println(s.contains("h"));
		System.out.println(s.contains("java"));
		
		System.out.println(s.startsWith("Hello"));
		System.out.println(s.endsWith("ming"));
		System.out.println(s.startsWith("this", 7));
		
		System.out.println(s.equals("hello, this is java programming")); //comparing the values
		System.out.println(s.equalsIgnoreCase("hello, this is java programming"));
		
		System.out.println("j found at index " + s.indexOf('j'));
		System.out.println("J found at index " + s.indexOf('J'));
		System.out.println("Hello found at index " + s.indexOf("Hello"));
		System.out.println("programming found at index " + s.indexOf("Programming"));
		System.out.println("i found at index " + s.indexOf('i'));
		System.out.println("i found at index " + s.indexOf('i', 10));
		System.out.println("i found at index " + s.indexOf('i', 13));
		System.out.println("last i found at index " + s.lastIndexOf('i'));
		
		String s2 = new String("Ram").intern();
		//In the new keyword way, intern method tells java that variable should
		//point to the object created in the pool, not the heap one
		String s3 = "Ram".intern();
		//In literal way, intern() is used by default
		
		String s4 = " ";
		System.out.println(s4.isBlank());
		System.out.println(s4.isEmpty());
		
		System.out.println("Length of s is " + s.length());
		
		System.out.println("ram@gmail.com".matches("^([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_\\-\\.]+)\\.([a-zA-Z]{2,5})$"));
		
		//ram@gmail.com
		//r@gmail.com
		//r@gmail.c
		//@gmail.com
		//@abc@gamil.com
		//ram123
		
		System.out.println("Modified string is " + s.replace("i", "x"));
		System.out.println("Original string after modification is " + s);
		
		String array[] = s.split(" ");
		// Output -> ["hello," , "this" , "is" , "java" , "programming" ]
		
		System.out.println(s.substring(7));
		System.out.println(s.substring(7, 19));
		
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		char letters[] = s.toCharArray();
		// letters = ['H', 'e', 'l', 'l', 'o']
		
		StringsDemo obj = new StringsDemo();
		//obj.clone(); //clone fn has been given to my class by the god class - 
		//class Object
		
	}
}
