package DSA_Easy;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class ValidParentheses20 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter parentheses: ");
		String input = keyboard.next();

		boolean output = isValid(input);
		System.out.println("Output: " + output);

	}

	public static boolean isValid(String input) {
		if (input.length() % 2 == 1) {
			return false;
		}
		HashMap<Character, Character> map = new HashMap<Character, Character>();

		map.put('(', ')');
		map.put('{', '}');
		map.put('[', ']');

		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < input.length(); i++) {
			char currentChar = input.charAt(i);
			if (map.containsKey(currentChar)) { // if map contains ( { [ => stack will push map.value ) } ] 
				stack.push(map.get(currentChar));
			}else {
			if (stack.isEmpty() || stack.pop() != currentChar) { // if stack is empty means no match or no key in map is found
																// stack.pop() == currentChar, now stack is empty, loop again to next index
				return false;
			}
			}
		}

		return stack.isEmpty();
	}

}
