package DSA_Easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ClimbingStairs {
	// Top-down (memoization)
	private static Map<Integer, Integer> memo = new HashMap<>();

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter top: ");
		int top = keyboard.nextInt();

		int output = climbStairs(top);
		System.out.print("the number of ways: " + output);
	}

	// bottom up (tabulation)
	// dynamic programing & dynamic array
	// 1 step or 2 steps
	public static int bottomUp(int top) {
		if (top == 1) {
			return 1;
		}
		int a = 1, b = 2, temp = 0;

		for (int i = 3; i <= top; i++) {
			temp = a + b;
			a = b;
			b = temp;

		}
		return temp;
	}

	// memoization || HashMap
	// 1 step or 2 steps
	public static int memoization(int n) {
		if (n == 1)
			return 1;
		if (n == 2)
			return 2;

		// if result is store, will get it from Map, no further calculation
		if (memo.containsKey(n))
			return memo.get(n);

		// recursive
		int result = memoization(n - 1) + memoization(n - 2);
		memo.put(n, result);

		return result;
	}

	// 1 step or 2 steps
	public static int climbStairsTwo(int top) {
		if (top == 1) {
			return 1;
		}
		int[] arr = new int[top + 1]; // i== top => arr.length > top or == top+1

		arr[1] = 1; // number of way to climb 1 level
		arr[2] = 2; // number of way to climb 2 level

		for (int i = 3; i <= top; i++) {
			arr[i] = arr[i - 1] + arr[i - 2];
		}

		return arr[top];
	}

	// 1 step or 3 steps
	public static int climbStairs(int top) {
		if (top == 1 || top == 2) {
			return 1;
		}
		int[] arr = new int[top + 1];

		arr[1] = 1;
		arr[2] = 1;
		arr[3] = 2;

		for (int i = 4; i <= top; i++) {
			arr[i] = arr[i - 1] + arr[i - 3];
		}

		return arr[top];
	}
}
