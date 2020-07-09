package questions;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution6 {
	
	static int myXOR(int x, int y) 
	{ 
	    return (x | y) & (~x | ~y); 
	} 
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int sizeOfArrays = scanner.nextInt();
		int A[] = new int[sizeOfArrays];
		int B[] = new int[sizeOfArrays];
		
		for(int i = 0; i < sizeOfArrays; i++) {
			A[i] = scanner.nextInt();
		}
		
		for(int i = 0; i < sizeOfArrays; i++) {
			B[i] = scanner.nextInt();
		}
		
		System.out.println("Sample Input");
		System.out.println(sizeOfArrays);
		for(int element : A) {
			System.out.print(element + " ");
		}
		System.out.println();
		for(int element : B) {
			System.out.print(element + " ");
		}
		
		scanner.close();
		
		ArrayList<Integer> APLE = new ArrayList<>();
		ArrayList<Integer> BPLE = new ArrayList<>();
		int X = 0;
		int Y = 0;
		
		for(int i = 0; i < sizeOfArrays; i++) {
			if(APLE.size() == 0) {
				X = A[i];
			}
			else {
				X = myXOR(A[i], APLE.get(0));
			}
			if(BPLE.size() == 0) {
				Y = B[i];
			}
			else {
				Y = myXOR(B[i], BPLE.get(0));
			}
			
			if(X > Y) {
				APLE.add(A[i]);
//				A[i] = -1;
			}
			
			if(X < Y) {
				BPLE.add(B[i]);
//				B[i] = -1;
			}
		}
		
		System.out.println(BPLE.size());
	}
}
