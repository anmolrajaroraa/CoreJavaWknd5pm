package oops2;

import oops.Parent;

public class Child extends Parent{
	
	@Override
	public void printAnything() {
		System.out.println("Overridden fn...");
	}
	
	@Override
	protected void show() {
		System.out.println("Overridden show fn...");
	}
	
//	@Override
//	private void print() {
//		
//	}

	public static void main(String[] args) {
		
		Child obj = new Child();
//		obj.print();
		obj.show();
		obj.printAnything();

	}

}
