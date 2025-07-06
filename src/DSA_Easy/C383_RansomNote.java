package DSA_Easy;

import java.util.ArrayList;
import java.util.List;

public class C383_RansomNote {
	// 2 strings ransomNote and magazine
	// conducted by using letters from magazine -> true : false
	// each letter in magazine used 1
	
	
	// list, length 26, store each char 
	// minus 1 if include ransomNote char
	// -1 return false
	public boolean canConstruct(String ransomNote, String magazine) {
		
		int[] chars = new int[26];
		int ranLength = ransomNote.length();
		
		for(int i = 0; i< magazine.length(); i++) {
			int position = magazine.charAt(i) - 'a';
			chars[position]++;
			if(i < ranLength) {
				int ranPosition = ransomNote.charAt(i) - 'a';
				chars[ranPosition]--;
			}
		}
		
		for(int n : chars) {
			if(n < 0) {
				return false;
			}
		}
				
		return true;
	}
}
