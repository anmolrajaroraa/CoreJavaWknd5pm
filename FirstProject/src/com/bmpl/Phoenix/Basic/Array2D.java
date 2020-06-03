package com.bmpl.Phoenix.Basic;

public class Array2D {

	public static void main(String[] args) {
		
		int arr[][] = { {1,2,3,4}, {4,5,6,7,8}, {8,9,10,11,12,13}, {10,11,12,13,14,15,16}, {11} };

//		for(int i = 0; i < arr.length; i++) {
////			arr[i] -> {1,2,3,4,5}
//			int[] temp_array = arr[i];
//			
//			for(int j = 0; j < temp_array.length; j++) {
//				System.out.print( temp_array[j] + " ");
//			}
//			
//			System.out.println();
//		}
		
		for(int i = 0; i < arr.length; i++) {
			
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print( arr[i][j] + " ");
			}
			
			System.out.println();
		
		}
		
		System.out.print("[ ");
		for(int array1d[] : arr) {
			
			System.out.print("[ ");
			for(int element : array1d) {
				System.out.print(element + " ");
			}
			System.out.print(" ]");
			System.out.println();
		}
		System.out.print(" ]");
		
	}

}
