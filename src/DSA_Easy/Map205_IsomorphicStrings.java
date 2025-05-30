package DSA_Easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Map205_IsomorphicStrings {

	// key: char from s, value: char from t
	public boolean isIsomorphic(String s, String t) {
		Map<Character, Character> map = new HashMap<>(); // <s.char, t.char>
		Set<Character> tMap = new HashSet<>(); // values of t.char, add 1 time only

		for (int i = 0; i < s.length(); i++) {
			char sChar = s.charAt(i);
			char tChar = t.charAt(i);

			if (map.containsKey(sChar)) { // s in map
				if (map.get(sChar) != tChar) { // s has t value, if t is different
					return false;
				}
			} else {
				if (tMap.contains(tChar)) { // if tChar already added, mapped with sChar
					return false;
				}
				tMap.add(tChar);
				map.put(sChar, tChar);
			}

		}
		return true;

	}
}
