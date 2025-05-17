package DSA_Easy;

public class A242_ValidAnagram {

	// s = "anagram", t = "nagaram"
	// s = rat, t = car
	// chars[0] =  0 | chars[2] = -1 | chars[17] = 0 | chars[19] = 1 

	public boolean isAnagram(String s, String t) {
		if (s.length() != t.length())
			return false;
		// work on the same array with 26 values (a-z: lowercase)
		int[] chars = new int[26];

		for (int i = 0; i < s.length(); i++) {
			chars[s.charAt(i) - 'a']++; // plus 1
			chars[t.charAt(i) - 'a']--; // minus 1
		}
		// loop through char, and compare each value with 0
		for (int count : chars) {
			if (count != 0) {
				return false;
			}
		}
		return true;
	}

	// WRONG: get total of all chars
	public boolean isAnagram_Wrong(String s, String t) {
		if (t.length() != s.length()) {
			return false;
		}
		int sumS = 0;
		int sumT = 0;

		for (int i = 0; i < s.length(); i++) {
			sumS += s.charAt(i);
			sumT += t.charAt(i);
		}
		return sumS == sumT;
	}
}
