package DSA_Easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class MostFrequentEvenElement2404 {

	public static void main(String[] args) {
		int[] nums = { 8154, 9139, 8194, 3346 };

		int output = findMostFrequentElement(nums);
		System.out.print("Output: " + output);

		
		int output2 = findMostFrequentElement2(nums);
		System.out.print("Output  2 : " + output2);

	}
	public static int findMostFrequentElement2(int[] nums) {
		
		
		
		
		return -1;
	}

	public static int findMostFrequentElement(int[] nums) {
		if (nums.length == 1) {
			if (nums[0] % 2 == 0) {
				return nums[0];
			} else {
				return -1;
			}
		}
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 == 0 && !map.containsKey(nums[i])) {
				map.put(nums[i], 1);
			}
			if (map.containsKey(nums[i])) {
				map.put(nums[i], map.get(nums[i]) + 1);
			}
		}
		if (map.size() == 0) {
			return -1;
		}
		int max = 1;
		for (Integer i : map.keySet()) {
			if (map.get(i) >= max) {
				max = map.get(i);
			}
		}
		ArrayList<Integer> minArr = new ArrayList<>();
		for (Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() == max) {
				minArr.add(entry.getKey());
			}
		}
		int min = minArr.get(0);
		for (int j = 0; j < minArr.size(); j++) {
			if (minArr.get(j) <= min) {
				min = minArr.get(j);
			}
		}

		return min;
	}
}