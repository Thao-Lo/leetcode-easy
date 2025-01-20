package DSA_Easy;

import java.util.HashSet;
import java.util.Set;

public class S645_SetMismatch {

	public static void main(String[] args) {

		int[] nums = { 1, 2, 2, 4 };
		int[] noDuplicate = findErrorNums(nums);
		for (int i = 0; i < noDuplicate.length; i++) {
			System.out.print(noDuplicate[i] + ", ");
		}
	}

	public static int[] findErrorNums(int[] nums) {

		int[] results = new int[2];
		int length = nums.length;
		int expextedSum = length * (length + 1) / 2;
		int actualSum = 0;
		Set<Integer> seen = new HashSet<>();

		for (int i = 0; i < length; i++) {
			actualSum += nums[i];
			if (!seen.add(nums[i])) {
				results[0] = nums[i];
			}

		}
		results[1] = expextedSum - (actualSum - results[0]);
		return results;
	}
}
//boolean[] seen = new boolean[n + 1];
//for (int num : nums) {
//if (seen[num]) {
//    result[0] = num; // Duplicate number
//}
//seen[num] = true;
//}
