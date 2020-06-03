package oops2;

public class Alto800 implements Car{
	
//	public Alto800(String carName) {
//		System.out.println("Param cons..." + carName);
//	}

//	void manualGears(int noOfGears) {
//		System.out.println("Shift gears manually...");
//	}
	void automaticGears() {
		System.out.println("Shift gears automatically");
	}
	void automaticWindows() {
//		System.out.println("Operate windows using lever");
		System.out.println("Power windows....");
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
