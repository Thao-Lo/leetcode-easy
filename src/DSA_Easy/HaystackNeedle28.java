package DSA_Easy;

import java.util.Scanner;

public class HaystackNeedle28 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Haystack: ");
		String haystack = keyboard.next();

		System.out.print("Needle: ");
		String needle = keyboard.next();
		System.out.println(needle.length());

		int output = findFirstOccurrence(haystack, needle);
		
		System.out.println("output: " + output);
	}

	//runtime: 1ms
	public static int findFirstOccurrence(String haystack, String needle) {
		int needleIndex = 0;
		for (int i = 0; i < haystack.length(); i++) {
			if(haystack.charAt(i) == needle.charAt(needleIndex)){
				needleIndex++;
			}else {
				i = i - needleIndex;
				needleIndex = 0;
			}
			if(needleIndex == needle.length()) {
				return i - needleIndex + 1;
			}
		}

		return -1;
	}
	
	//leetcode solution
	    public static int strStr(String haystack, String needle) {
	        return haystack.indexOf(needle); //built-in method to find the substring, if it is not found will return -1 
	    }
	
}
