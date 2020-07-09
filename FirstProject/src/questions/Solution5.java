package questions;

public class Solution5 {

	public static void main(String[] args) {
		
//		int[] arr = {1,2,3,4};
//		int[] arr = {1,2,3,9};
//		int[] arr = {9,9,9,9};
		int[] arr = {9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9};  // 2170000000
		
		int carry = 1;
		
		for(int i = arr.length - 1; i >= 0; i--) {
			if(arr[i] == 9) {
				carry = 1;
				arr[i] = 0;
			}
			else {
				arr[i]++;
				carry = 0;
			}
				
			if(carry == 0) break;
		}
		
		if(carry == 1) {
			arr = new int[arr.length + 1];
			arr[0] = 1;
		}
		
		for(int element: arr) {
			System.out.print(element);
		}
		
//		int num = 0;
//		
//		for(int i = 0; i < arr.length; i++) {
//			num += arr[i] * Math.pow(10, arr.length - 1 - i);
//		}
//		
//		System.out.println(++num);
//		
//		String result = Integer.toString(num);
//		
//		int newArr[] = new int[result.length()];
//		
//		for(int i = 0; i < newArr.length; i++) {
//			newArr[i] = result.charAt(i) - '0';  // '1' - '0' -> 49 - 48 -> 1
//		}
//		
//		for(int element: newArr) {
//			System.out.print(element + ", ");
//		}
		
		
		
//		char c = 97;
//		'9' - '0' -> 57 - 48 -> 9
		
//		BigInteger num = BigInteger.valueOf(0);
//		
//		for(int i = 0; i < arr.length; i++) {
//			double d = Math.pow(10, arr.length - 1 - i);
//			BigDecimal bd = BigDecimal.valueOf(d);
//			BigInteger bi = bd.toBigInteger();
//			BigInteger bi2 = BigInteger.valueOf(arr[i]);
////			System.out.println(bi2);
//			num = num.add(bi.multiply(bi2));
////			System.out.println(num);
//		}
//		
//		num = num.add(BigInteger.valueOf(1));
//		System.out.println(num);

	}

}
