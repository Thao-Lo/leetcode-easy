package DSA_Medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class S17_LetterCombinationOfPhoneNumber {

	public List<String> letterCombinations(String digits) {
		if (digits == null || digits.length() == 0) {
			return new ArrayList<>();
		}
		Map<Character, String> map = Map.of('2', "abc", '3', "def", '4', "ghi", '5', "jkl", '6', "mno", '7', "pqrs",
				'8', "tuv", '9', "wxyz");

		// BFS: Breadth-First Search -> level to level travesal
		Queue<String> queue = new LinkedList<>();
		queue.offer("");

		// 3 x 3 x 3 x 3..
		for (int i = 0; i < digits.length(); i++) {
			// get letters from each digit, each level, 1st letter is level 1
			String letters = map.get(digits.charAt(i));
			int size = queue.size(); // 1st level size = 1; ""
			for (int j = 0; j < size; j++) {
				String prev = queue.poll(); // take front (oldest): a [b,c]
				for (char c : letters.toCharArray()) {
					queue.offer(prev + c); // add to back(newest): [b, c, ad, ae, af]
				}
			}
		}
		return new ArrayList<>(queue);
	}

// recursive function: 2 arrays
	public static List<String> backtrack(String digits) {

		return null;
	}

}
// 2 to 9: digits length from 0 to 4
//single number: return each letter in a string
// 2 numbers: return each pair from 6 letter 
