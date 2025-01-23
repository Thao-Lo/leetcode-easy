package DSA_Easy;

import java.util.Scanner;

public class Set3370_SmallestNumberWithAllSetBits {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("n: ");
		// 1 <= n <= 1000
		int n = keyboard.nextInt();
		
		int x = smallestNumber1(n);
		System.out.print("Output: " + x);
	}

	// loop
	public static int smallestNumber1(int n) {
		// loop through k: x = 2^k - 1
		int x = 0;
		for (int i = 0; ; i++) {
			x = (int) (Math.pow(2, i) - 1);
			if (x >= n) {
				return x;
			}
		}
		
	}

	// Bitwise shifting - shifting 1 in binary 0001 / 0010
	public static int smallestNumber2(int n) {
		if (n == 1) {
			return n;
		}
		int x = 0;
		for (int i = 0;; i++) {
			x = (1 << i) - 1;
			if (x >= n) {
				return x;
			}
		}
	}
}
