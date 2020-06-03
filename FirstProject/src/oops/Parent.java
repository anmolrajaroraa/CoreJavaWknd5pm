package oops;

public class Parent extends Object{

	private int a;
	private int b = a + 1;
	
	void print() {
		System.out.println(a);
	}
	
	protected void show() {
		System.out.println(b);
	}
	
	public void printAnything() {
		System.out.println("Some fn for you");
	}
	
	private void secret() {
		
	}
	
}

// Access modifiers
// private - this thing can only be accessed from within the class
// default - this thing can be accessed only in this package
// protected - this thing can be accessed only in this package plus child classes 
// (those who inherit from parent, even sitting in other packages) can also access these functionalities 
// public - this thing can be accessed by anyone in this project

// Overriding rules
// Overriding can happen when inheritance is done
// Overriding means parent feature has outdated or requires improvement so we override it, to create a new functionality
// 1. Weaker access rule
// 2. Signature should remain same but there is some relaxation (you can use covariant type for changing return type of the fn)
// covariant means parent-child relationship