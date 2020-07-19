package questions;

public class Solution7 {
	
	public static char findFirstRepeatingCharacter(String s) {
		
//		for(int i = 0; i < s.length(); i++) {
//			
//			for(int j = i + 1; j < s.length(); j++) {
//				
//				if(s.charAt(i) == s.charAt(j)) {
//					return s.charAt(i);
//				}
//				
//			}
//			
//		}
		
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if(s.indexOf(c) != s.lastIndexOf(c)){
				return c;
			}
		}
		
		return '_';
		
	}

	public static void main(String[] args) {
		
		// ahjdookksnjdiocmbsjksk -> j
		// abcdedfb -> b
		// abcdef -> _
		
		System.out.println(new int[5]);
		Solution7 obj = new Solution7();
		System.out.println(obj);
		System.out.println("abcdefgh".lastIndexOf('a'));

	}

}
