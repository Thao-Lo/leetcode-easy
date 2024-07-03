package DSA_Easy;

import java.util.HashMap;

public class MajorityElement169 {

	public static void main(String[] args) {
		int[] nums = { 2, 2, 1, 1, 1, 2, 2 };

		int output = findMajority(nums);
		int output2 = findMajority2(nums);
						
		System.out.print("Output 1: " + output);
		System.out.println();
		System.out.print("Output 2 - O1: " + output2);
	}

	public static int findMajority(int[] nums) {
		if (nums.length == 1 || nums.length == 2) {
			return nums[0];
		}
		double halfArray = Math.ceil(nums.length / 2.0);
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if (!map.containsKey(nums[i])) {
				map.put(nums[i], 1);
			} else {
				map.put(nums[i], map.get(nums[i]) + 1);
			}
			if (map.get(nums[i]) >= (int) halfArray) {
				return nums[i];
			}
		}

		return 0;
	}

	public static int findMajority2(int[] nums) {
		int count = 1;
		int current = nums[0];

		for (int i = 1; i < nums.length; i++) {
			if (current == nums[i]) {
				count++;
			} else {
				count--;
				if (count == 0) {
					current = nums[i];
					count = 1;
				}
			}
		}

		return current;
	}
}
