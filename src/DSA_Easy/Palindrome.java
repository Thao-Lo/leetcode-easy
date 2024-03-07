package DSA_Easy;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		//hello
		Scanner keyboard = new Scanner(System.in);

		System.out.println(Math.ceil((double) 9 / 2));

		System.out.print("Please input a number: ");
		int inputNumber = keyboard.nextInt();

		boolean isPalindrome = isNumberPalindrom(inputNumber);
		System.out.println("Is Palindrome: " + isPalindrome);
	}

	public static boolean isInputNumberPalindrom(int inputNumber) {
		String numberToString = Integer.toString(inputNumber);

		char[] charArray = numberToString.toCharArray();
		char[] reversedArray;

		if (charArray.length % 2 == 0) {
			reversedArray = new char[charArray.length / 2];
		} else {
			reversedArray = new char[(charArray.length - 1) / 2];
		}
		for (int i = charArray.length - 1; i >= Math.ceil((double) charArray.length / 2); i--) {
			reversedArray[charArray.length - i - 1] = charArray[i];
		}
		for (int i = 0; i < reversedArray.length; i++) {
			if (reversedArray[i] != charArray[i]) {
				return false;
			}
		}
		return true;
	}
	public static boolean isNumberPalindrom(int inputNumber) {
		if(inputNumber <  0) {
			return false;
		}
		
		int originalNumber = inputNumber;
		int reversedNumber = 0;
				
		while(inputNumber > 0) {
			int digit = inputNumber % 10;
			reversedNumber = reversedNumber * 10 + digit; 
			inputNumber = inputNumber / 10;
		}
		
		return originalNumber == reversedNumber;
	}
}
