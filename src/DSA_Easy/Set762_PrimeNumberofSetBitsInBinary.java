package DSA_Easy;

import java.util.stream.IntStream;

public class Set762_PrimeNumberofSetBitsInBinary {

	public static void main(String[] args) {
		int output = countPrimeSetBits(10, 15);
		System.out.println(output);
	}

	public static int countPrimeSetBits(int left, int right) {
		// numbers between left and right
		int countPrime = 0;
		for (int i = left; i <= right; i++) {
			// from 3 -> 11, 5 -> 101
			String binary = Integer.toBinaryString(i);
			int countOne = 0;
			// calculate set bits each number
			for (int j = 0; j < binary.length(); j++) {
				if (binary.charAt(j) == '1') {
					countOne++;
				}
			}
			// check isPrimeNumber
			if (isPrimeNumber(countOne)) {
				// filter numbers with prime set
				countPrime++;
			}
		}

		return countPrime;
	}

	public static boolean isPrimeNumber(int num) {
		if (num <= 1) {
			return false;
		}
		if (num <= 3) {
			return true;
		}
		// range between 2 and int square root of num
		// 29 -> 5, 2,3,5 -> 29 %2,3,5 != 0 -> false -> Prime
		return IntStream.rangeClosed(2, (int) Math.sqrt(num)).noneMatch(n -> num % n == 0);
	}

}
