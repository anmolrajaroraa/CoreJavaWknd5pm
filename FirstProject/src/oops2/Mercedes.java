package oops2;

public class Mercedes implements Car{

	void automaticWindows(){
		System.out.println("Power windows from Merc...");
	}
	
	void automaticGears() {
		System.out.println("Automatic gear shifting from Merc...");
	}

	@Override
	public void gears() {
		automaticGears();
	}

	@Override
	public void windows() {
		automaticWindows();
	}
	
	
	
}
