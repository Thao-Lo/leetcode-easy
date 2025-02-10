package DSA_Easy;

import java.util.Stack;

public class A3174_ClearDigits {

	public static void main(String[] args) {
		String s = "bca1n5b43v";
		System.out.print("result: " + clearDigits(s));
	}

	// Stack: first in last out
	public static String clearDigits(String s) {
		Stack<Character> chars = new Stack<>();

		for (char c : s.toCharArray()) {
			if (Character.isDigit(c)) { 
				if (!chars.isEmpty()) { //is c is a digit, last character in stack will be popped out
					chars.pop();
				}
			} else {
				chars.push(c); //if c is a character, store in stack
			}
		}

		StringBuilder result = new StringBuilder();
	
		for (char c : chars) {
			result.append(c);
		}
		
		//if chars is empty, it will return ""
		return result.toString();
	}

}
