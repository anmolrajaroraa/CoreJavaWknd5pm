package questions;

public class Solution5 {

	public static void main(String[] args) {
		
//		int[] arr = {1,2,3,4};
//		int[] arr = {1,2,3,9};
//		int[] arr = {9,9,9,9};
		int[] arr = {9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9};
		
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
		

	}

}
