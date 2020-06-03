package oops2;

import java.lang.reflect.InvocationTargetException;
import java.util.ResourceBundle;

public class CarFactory {

	static Car getCar() throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
//		return new Mercedes();
		
		ResourceBundle rb = ResourceBundle.getBundle("config");
		String className = rb.getString("className");
//		Car car = null;
		
//		Car car = new className();
		
		/*
		 * Load class dynamically
		 * Get constructor from the loaded class
		 * Create a new instance but it will be of type Object
		 * Type cast object into Car object to return it successfully
		 */
		
		Object object = Class.forName(className).getDeclaredConstructor().newInstance();
		
//		if(className.equals("Alto800")) {
//			car = new Alto800();
//		}
//		else if(className.equals("Mercedes")) {
//			car = new Mercedes();
//		}
//		return car;
		
		return (Car)object;
	}
	
}
