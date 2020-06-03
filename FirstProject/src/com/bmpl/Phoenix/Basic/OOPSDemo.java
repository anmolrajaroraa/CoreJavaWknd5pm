package com.bmpl.Phoenix.Basic;

import java.util.Scanner;

public class OOPSDemo {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		scanner.close();

	}

}



// C - lag ?
// C++ - class and objects

class Account{
	int account_id;
	int balance;
	
	void withdraw() {
		
	}
}

// class name should always be a noun or related to some entity - title case
// functions name should always be verb or some kind of action - camel case

// class is a custom data type or just a blueprint - no memory consumption
// objects - instances of this blueprint, 

// SOLID
// S - SRP - Single Responsibility Principle
// O - Open and Close - Classes should be open for inheritance but closed for modification
// D - DRY - Do Not Repeat Yourself

class Student{
void add(){
	
}
}

class Teacher{
	void add(){
	
}
}

class Subject{
	void add(){
	
}
}

class BookOfLibrary{
	void AddBookToDatabase(){
	
}
}
//
//add(); -> ambiguity
//Student obj;
//obj.add();

