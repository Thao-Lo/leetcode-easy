package DSA_Medium;

import java.util.ArrayList;
import java.util.List;

public class A39_Combination_Sum {

	// candicates = [2,3,5]
	// target = 8
	// [[2,2,2,2],[2,3,3],[3,5]]

	public List<List<Integer>> combinationSum(int[] candidates, int target) {
		// minus? 2 pointers? recursive
		List<List<Integer>> outcome = new ArrayList<>();
		List<Integer> list = new ArrayList<>();
		backtrack(candidates, target, 0, outcome, list);
		return outcome;
	}
	// nums[2,3]
	public static void backtrack(int[] nums, int target, int start, List<List<Integer>> outcome, List<Integer> list) {
		if (target == 0) {
			outcome.add(new ArrayList<>(list)); // add the copy list
			return;
		}
		for (int i = start; i < nums.length; i++) {
			if (nums[i] > target) { // 5 > 3
				continue;
			}
			// nums[i] == 2, target == 5
			int newTarget = target - nums[i];
			list.add(nums[i]); // add nums[i] = 2
			backtrack(nums, newTarget, i, outcome, list); // nums, 3, 0, [], [2]
			// out of backtrack, remove last element (not satisfy), loop next index
			list.remove(list.size() - 1);
		}
	}
}
