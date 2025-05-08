package DSA_Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class A15_3Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public List<List<Integer>> threeSum(int[] nums) {

		Set<List<Integer>> setList = new HashSet<>();

		for (int i = 0; i < nums.length; i++) {
			Set<Integer> set = new HashSet<>();
			int target = -nums[i];
			// find two-sum (j, k) = target, start array loop j+1
			for (int j = i + 1; j < nums.length; j++) {
				int completion = target - nums[j];
				if (set.contains(completion)) {
					List<Integer> triple = Arrays.asList(nums[i], completion, nums[j]);
				//  triple.sort(Integer::compareTo);
				//  Collections.sort(triple);
					setList.add(triple);
				}
				set.add(nums[j]);
			}
		}

		return new ArrayList<>(setList);
	}

}
// 3 distinct numbers with sum == 0
// x,j,k -> fix x, find y + k = -x/x
// sorted array or hash map?
