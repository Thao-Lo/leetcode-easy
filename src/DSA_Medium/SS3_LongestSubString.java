package DSA_Medium;

import java.util.HashMap;
import java.util.Map;

public class SS3_LongestSubString {

	public static void main(String[] args) {
		

	}

	// SLIDING WINDOW
	public int lengthOfLongestSubstring(String s) {
		int start = 0, max = 0;
		Map<Character, Integer> map = new HashMap<>();

		for (int i = 0; i < s.length(); i++) {
			if (map.containsKey(s.charAt(i))) { // new character, add to map + position
				map.put(s.charAt(i), i);
			} else { // dupliacate
				max = Math.max(max, i - (start + 1)); // update max
				if (start > map.get(s.charAt(i))) { // if start is at position higher than duplicate, no conflict
					start++; //wrong in this case abba
				} else {
					start = map.get(s.charAt(i)) + 1;
				}
				map.put(s.charAt(i), i);
			}
		}

		return max;
	}

	// sliding window, substring always stay inside the window
	public int lengthOfLongestSubstringRefactor(String s) {
		int start = 0, max = 0;
		Map<Character, Integer> map = new HashMap<>();

		//if char outside the window, ignore, not updating start -> abba (not using start++)
		for (int i = 0; i < s.length(); i++) {
			if (map.containsKey(s.charAt(i)) && start <= map.get(s.charAt(i))) {				
					start = map.get(s.charAt(i)) + 1; 				
			}			
			map.put(s.charAt(i), i); // update or create new k-v
			max = Math.max(max, i - start + 1); 

		}
		return max;
	}
}
