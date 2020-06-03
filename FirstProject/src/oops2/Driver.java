package oops2;

import java.lang.reflect.InvocationTargetException;

public class Driver {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
//		Alto800 alto = new Alto800();
//		alto.manualGears(4);
//		alto.manualWindows();
//		Car car = new Alto();
//		car.gears();
//		car.windows();
		
		Car car = CarFactory.getCar();
		car.gears();
		car.windows();

	}

}
