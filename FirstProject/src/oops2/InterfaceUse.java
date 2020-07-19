package oops2;

interface XX{
	void show(int x);
	default void display() {
		
	}
}

interface ZZ{
	void show(int x);
	void display();
}

class YY implements XX{
	
	public YY() {
		display();
	}

	@Override
	public void show(int x) {
		System.out.println("Show call...");
	}
	
}

//class ... implements XX{
//	
//}

public class InterfaceUse {

	public static void main(String[] args) {
		
//		int speed = (int) (Math.random() * 5);
//		System.out.println( speed == 0 ? 5 : speed );
		
		XX obj = new YY();
		obj.show(90);
		
		// anonymous class - no name
		// lazy class
		
		XX obj2 = new XX() {

			@Override
			public void show(int x) {
				System.out.println(x);
				
			}
			
		};
		obj2.show(99);
		
		ZZ obj3 = new ZZ() {
			
			@Override
			public void show(int x) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void display() {
				// TODO Auto-generated method stub
				
			}
		};
		
		// lambda expression can only work with -
		// functional interface / SAM (Single Abstract Method) interface
		
		
		XX obj4 = (x) -> System.out.println(x);
		
		XX obj5 = (x) -> {
			System.out.println(x);
			System.out.println(x);
			System.out.println(x);
		};
		
//		ZZ obj5 = (x) -> System.out.println(x);
		

	}

}
