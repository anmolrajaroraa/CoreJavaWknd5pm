package oops;

public class Parent2 extends Parent{
	
	@Override
	void print() {
		System.out.println("Overridden print fn...");
	}

	public static void main(String[] args) {
		
		Parent obj = new Parent();
		obj.print();
		obj.show();
		obj.printAnything();
		
	}
	
}
