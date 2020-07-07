package oops2;

interface XX{
	void show(int x);
	default void display() {
		
	}
}

class YY implements XX{
	
	public YY() {
		
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
		
		int speed = (int) (Math.random() * 5);
		System.out.println( speed == 0 ? 5 : speed );
		
		// creating a class lazily and it implements the X interface also
		
		XX obj = new YY();
		obj.show(100);
		
		XX obj2 = new XX() {

			@Override
			public void show(int x) {
				System.out.println("Anonymous class show fn call...");
			}
			
		};
		
		obj2.show(90);

	}

}
