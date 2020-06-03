package oops2;

class GrandParent{
	int x = 2500;
	void print() {
		System.out.println("Oldest version of print");
	}
}

class A0 extends GrandParent{
	int x = 1500;
}

class A1 extends A0{
	int x;
	int y = super.x;
	A1(){
		x = 100;
		System.out.println("Parent default cons");
	}
	A1(int x){
		this.x = x;
		System.out.println("Parent param cons");
	}
	int getParentX() {
		return super.x;
	}
	void print() {
		System.out.println(this);
	}
}
class A2 extends A1{
	int x = 500;
	//super cons call should always be in the first line
	A2(){
		super(1000);  //constructor chaining
//		super();
		System.out.println("Child default cons " + x);
	}
	A2(int x){
		this(); // constructor chaining
		System.out.println("Child param cons");
//		System.out.println(x + this.x + super.x + y);
//		System.out.println(x + this.x + super.x + getParentX());
		System.out.println("ans is" +  ( x + this.x + super.x + ((GrandParent)this).x  + 
				((A0)this).x ) );
	}
	@Override
	void print() {
		System.out.println(this + " child object");
		super.print();
	}
}

public class SupervsThis {

	public static void main(String[] args) {
//		A1 obj = new A1();
//		obj.print();
//		A1 obj2 = new A1();
//		obj2.print();
		
//		A2 obj = new A2();
		A2 obj = new A2(2000);
		obj.print();
		
//		GrandParent obj2 = new A2(2000);
		
//		byte b = 10;
//		int c = b;
//		byte d = (byte) c;
//		
//		obj2.print();
//		System.out.println(obj2.x);
//		obj2.x;
		// if we upcast, always overridden methods will be used
		// but the variables are accessed from the current cast of the object
//		Date date = new Date();
//		date.get
	}

}
