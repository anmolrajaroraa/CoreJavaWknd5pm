package oops2;

class Y{
	private int c = 30;

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}
	
}

class X implements Cloneable{
	
	private int a;
	private int b;
	private Y y = new Y();   // embedded object
	
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public Y getY() {
		return y;
	}
	public void setY(Y y) {
		this.y = y;
	}
	
	
//	public X cloneX() {
//		X obj = new X();
//		obj.a = this.a;
//		obj.b = this.b;
//		return obj;
//	}
//	public X cloneX() throws CloneNotSupportedException {
//		return (X) this.clone();
//	}
	
	@Override
	protected X clone() throws CloneNotSupportedException {
		X obj = (X) super.clone();
		obj.y = new Y();
		obj.y.setC( this.y.getC() );
		return obj;
	}
	
	
}

public class CloneTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		X obj1 = new X();
		obj1.setA(10);
		obj1.setB(20);
		
		X obj2 = obj1;
		
		obj2.setA(100);
		
		System.out.println(obj2.getA());
		System.out.println(obj2.getB());
		System.out.println("---------");
		System.out.println(obj1.getA());
		System.out.println(obj1.getB());
		
		obj1.getY().setC(300);
		
		X obj3 = obj1.clone();
		
		obj3.setA(10000);
		obj3.getY().setC(30000);
		
		System.out.println();
		System.out.println();
		System.out.println(obj3.getA());
		System.out.println(obj3.getB());
		System.out.println(obj3.getY());
		System.out.println(obj3.getY().getC());
		System.out.println("---------");
		System.out.println(obj1.getA());
		System.out.println(obj1.getB());
		System.out.println(obj1.getY());
		System.out.println(obj1.getY().getC());

	}

}
