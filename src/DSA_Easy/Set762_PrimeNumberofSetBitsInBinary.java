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
			if (isPrimeNumber1(countOne)) {
				// filter numbers with prime set
				countPrime++;
			}
		}

		return countPrime;
	}

	public static boolean isPrimeNumber1(int num) {
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

	public static boolean isPrimeNumber2(int num) {
		if (num <= 1) {
			return false;
		}
		if (num <= 3) {
			return true;
		}
		int sqrt = (int) Math.sqrt(num);
		// if num can % any number except 1, it is not a Prime
		// Prime only have 1 x num pair
		// 10 -> 1 x 10, 2 x 5, square root of 10 == 3, 10%2 == 0
		for (int i = 2; i <= sqrt; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

}
