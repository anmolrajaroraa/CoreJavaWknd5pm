package questions;

public class Solution4 {
	
	public static String convertDecimalToBinary(int number) {
		
		String binaryNumber = "";
		
		while(number != 0) {
			
			int remainder = number % 2;
			binaryNumber = Integer.toString(remainder) + binaryNumber;
			number /= 2;
			
		}
		
		return binaryNumber;
		
	}

	public static void main(String[] args) {
		
		System.out.println("binary number is " + convertDecimalToBinary(235689875));
		
	}

}
