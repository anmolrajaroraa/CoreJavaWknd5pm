package questions;

import java.util.HashMap;
import java.util.Scanner;

public class Solution3 {
	
//	public static char findFirstNonRepeatingCharacter(String s) {
//		for(int i = 0; i < s.length(); i++) {
////			System.out.println( s.charAt(i) );
//			
//			boolean isDuplicateFound = false;
//			char element = s.charAt(i);
//			
//			for(int j = 0; j < s.length(); j++) {
//				
//				if(s.charAt(j) == element && i != j) {
//					isDuplicateFound = true;
//					break;
//				}
//				
//			}
//			
//			if(!isDuplicateFound) {
//				return element;
//			}
//			
//		}
//		
//		return '_';
//
//	}
	
//	public static char findFirstNonRepeatingCharacter(String s) {
//		
//		for(int i = 0; i < s.length(); i++) {
//			char element = s.charAt(i);
//			if( s.indexOf(element) == s.lastIndexOf(element) ) {
//				return element;
//			}
//		}
//		
//		return '_';
//
//	}
	
//	public static char findFirstNonRepeatingCharacter(String s) {
//		
//		int[] alphabets = new int[26];
//		
////		[3,1,3,1,3,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]
//		
//		for(int i = 0; i < s.length(); i++) {
//			char element = s.charAt(i);
//			int index = element - 'a';
//			alphabets[index]++;
//			// a -> 97 - 97 -> 0
//			// b -> 98 - 97 -> 1
//			// c -> 99 - 97 -> 2
//			// z -> 122 - 97 -> 25
//		}
//		
//		for(int i = 0; i < alphabets.length; i++) {
//			System.err.print(alphabets[i] + ", ");
//		}
//		
//		for(int i = 0; i < s.length(); i++) {
//			char element = s.charAt(i);
//			int index = element - 'a';
//			if(alphabets[index] == 1) {
//				return element;
//			}
//		}
//		
//		return '_';
//
//	}
	
	public static char findFirstNonRepeatingCharacter(String s) {
		
		HashMap<Character, Integer> alphabetCount = new HashMap<>();
		
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if(alphabetCount.containsKey(c)) {
				int currentCount = alphabetCount.get(c);
				currentCount++;
				alphabetCount.put(c, currentCount);
			}
			else {
				alphabetCount.put(c, 1);
			}
		}
		
		System.out.println(alphabetCount);
		
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if(alphabetCount.get(c) == 1) {
				return c;
			}
		}
		
		return '_';

	}



	public static void main(String[] args) {
		
		// print out first non-repeating character
		// all the characters in the string will be a-z
		// there will be atleast a character in the string
		// if all the characters are repeating then print _
		
		// aaabcccdeeef
		// aabbccddeeff
		
		Scanner scanner = new Scanner(System.in);
		
		String s = scanner.nextLine();
		
		char result = findFirstNonRepeatingCharacter(s);
		System.out.println(result);
				
		scanner.close();

	}

}


// aaabcccdeeef
/*
 * { 'a' : 1 } 
*/