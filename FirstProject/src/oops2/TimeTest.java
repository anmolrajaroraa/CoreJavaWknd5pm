package oops2;

public class TimeTest {

	public static void main(String[] args) {
		
		Long startTime = System.currentTimeMillis();
		
		for(int i = 1; i <= 100000; i++) {
			System.out.println("This fn called");
		}
		Long endTime = System.currentTimeMillis();
		
		System.out.println(endTime - startTime);

	}

}
