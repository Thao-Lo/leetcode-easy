package DSA_Easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RomanToInteger {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter an Roman number: ");
		String romanLetter = keyboard.next().toUpperCase();

		int value = romanToInt(romanLetter); //use switch case
		// int value = convertRomanToInteger(romanLetter); //use Map
		System.out.println("Roman to Integer: " + value);

	}

	public static int convertRomanToInteger(String romanLetter) {
		int value = 0;
		Map<String, Integer> map = new HashMap<>();
		map.put("I", 1);
		map.put("V", 5);
		map.put("X", 10);
		map.put("L", 50);
		map.put("C", 100);
		map.put("D", 500);
		map.put("M", 1000);

		char[] romanArray = romanLetter.toCharArray();

		for (int i = 0; i < romanArray.length; i++) {
			String currentLetter = String.valueOf(romanLetter.charAt(i));
			int currentValue = map.get(currentLetter);
			if (i == romanArray.length - 1 || currentValue >= map.get(String.valueOf(romanLetter.charAt(i + 1)))) {
				value += currentValue;
			} else {
				value -= currentValue;
			}

		}
		return value;
	}

	public static int romanToInt(String s) {
		int value = 0, number = 0;
		for (int i = s.length() - 1; i >= 0; i--) {
			switch (s.charAt(i)) {
			case 'I':
				number = 1;
				break;
			case 'V':
				number = 5;
				break;
			case 'X':
				number = 10;
				break;
			case 'L':
				number = 50;
				break;
			case 'C':
				number = 100;
				break;
			case 'D':
				number = 500;
				break;
			case 'M':
				number = 1000;
				break;
			}
			// III & IV 
			if(4*number < value) {
				value -= number;
			}else {
				value += number;
			}
		}

		return value;
	}

}
