package oops2;

import java.util.Locale;
import java.util.ResourceBundle;

public class I18N {

	public static void main(String[] args) {
		
		Locale locale = new Locale("en", "US");
		
		ResourceBundle rb = ResourceBundle.getBundle("messages", locale);
		//   messages_hn_IN.properties
		System.out.println(rb.getString("greet"));

	}

}
