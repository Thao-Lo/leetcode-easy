package DSA_Easy;

import java.util.Scanner;

public class SearchInsertPosition {

	public static void main(String[] args) {
		int[] nums = { 1, 3, 5, 7, 9, 11, 14, 19 };

		Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter target number: ");
		int targetNum = keyboard.nextInt();

		int index = findIndex(nums, targetNum);
		System.out.println("Output: " + index);
	}

	public static int findIndex(int[] nums, int targetNum) {
		int low = 0;
		int high = nums.length - 1;

		while (low <= high) {
			int middle = low + (high - low) / 2; // keep updating middle position - binary search
			int middleNum = nums[middle];
			if (middleNum == targetNum) {
				return middle;
			}
			if (targetNum > middleNum) {
				low = middle + 1;
			}else {
				high = middle - 1;
			}
		}
		return low;
	}
}

