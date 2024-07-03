package DSA_Easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PlusOne {

	public static void main(String[] args) {
		int[] digits = { 1, 9, 9, 9 };

		int[] output = plusOne1(digits);
		System.out.println(Arrays.toString(output));
	}

	public static int[] plusOne(int[] digits) {
		int[] output = new int[digits.length];

		if (digits.length == 1 && digits[0] == 9) {
			output = new int[digits.length + 1];
			output[0] = 1;
			output[1] = 0;
			return output;
		}

		if (digits[digits.length - 1] != 9) {
			digits[digits.length - 1] += 1;
			return digits;
		}

		if (digits[digits.length - 1] == 9) {
			for (int i = 0; i < digits.length - 2; i++) {
				output[i] = digits[i];
			}
			output[digits.length - 2] = digits[digits.length - 2] + 1;
			output[digits.length - 1] = 0;
		}
		return output;
	}

	public static int[] plusOne1(int[] digits) {

		if (digits[digits.length - 1] != 9) {
			digits[digits.length - 1] += 1;
			return digits;
		}

		int num = 1;
		for (int i = digits.length - 1; i >= 0; i--) {
			int sum = digits[i] + num; // [1,9]
			digits[i] = sum % 10; // if digist[i] = sum, incorrect when sum == 10, 10%10 ==0 => digits[i] = 0
			num = sum / 10; // then sum = next digit + 1 => 2 and update digit again == sum % 10 =>
							// digits[i] == 2
			if (num == 0) { // num = sum / 10 => 2/10 == 0 => break
				break;
			}
		}

		if (num == 1) {
			int[] output = new int[digits.length + 1];
			output[0] = 1;
			return output;

		}

		return digits;
	}

	//Solution on Leetcode with runtime = 0s
	public int[] plusOneLeetCode(int[] digits) {
		for (int i = digits.length - 1; i >= 0; i--) {
			if (digits[i] == 9) {
				digits[i] = 0;
			} else {
				digits[i]++;
				return digits;
			}
		}
		digits = new int[digits.length + 1];
		digits[0] = 1;
		return digits;
	}
}
