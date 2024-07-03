package DSA_Easy;

import java.util.ArrayList;

public class LongestCommonPrefix14 {

	public static void main(String[] args) {
		String[] strs = { "flower", "flow", "floght" };

		String output = findLongestCommonPrefix(strs);
		System.out.print("Output: " + output);
		
		System.out.println();
		
		String stringBuilder = findLongestCommonPrefix2(strs);
		System.out.print("StringBuilder: " + stringBuilder);
	}

	//runtime 2ms 
	//memory 41.26 mb
	public static String findLongestCommonPrefix(String[] strs) {

		String first = strs[0];		
		ArrayList<Character> list = new ArrayList<>();		

		for (int i = 0; i < first.length(); i++) {
			char letter = first.charAt(i);
			for (int j = 1; j < strs.length; j++) {
				if (i >= strs[j].length() || strs[j].charAt(i) != letter) {
					return convertArrayToString(list);
				} 
			}
			list.add(first.charAt(i));
		}		
		return convertArrayToString(list);
	}
	public static String convertArrayToString(ArrayList<Character> list) {
		String output = "";
		for(Character i: list) {
			output += i;
		}
		return output;
	}
	
	//Use StringBuilder 
	//runtime: 1ms
	//memory: 41.31 mb
	public static String findLongestCommonPrefix2(String[] strs) {		
		String first = strs[0];		
		StringBuilder output = new StringBuilder();	
		for (int i = 0; i < first.length(); i++) {
			char letter = first.charAt(i);
			for (int j = 1; j < strs.length; j++) {
				if (i >= strs[j].length() || strs[j].charAt(i) != letter) {
					return output.toString();
				} 
			}
			output.append(letter);
		}		
		return output.toString();		
	}
}


