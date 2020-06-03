package oops2;

class TryTypePromotion{
	void test(int x) {
		System.out.println("int");
	}
	void test(Integer x) {
		System.out.println("Integer");
	}
	void test(long x) {
		System.out.println("long");
	}
	void test(byte x) {
		System.out.println("byte");
	}
	void test(short x) {
		System.out.println("short");
	}
	void test(int ...x) {
		System.out.println("int...");
	}
	// ... -> varargs -> variable arguments -> internally this is an array
	// TypePromotion
	// 0. Default case - primitive int - 10 by default is treated as int
	// 1. Widening - primitive long - int value can be easily accomated in long type
	// 2. Wrapper class - autoboxing is used to convert int into Integer object
	// 3. varargs -> although it stores multiple elements but can be used for a single element
	// 4. byte and short -> never goes to these types because if data is too large for them value of argument can be distorted
	// they can be used deliberately by doing explicit type casting
}

public class TypePromotion {

	public static void main(String[] args) {
		TryTypePromotion obj = new TryTypePromotion();
		obj.test(10);
//		obj.test((byte)10);
//		obj.test(Integer.valueOf(10)); // autoboxing
	}

}
