package DSA_Easy;

import java.util.HashMap;

public class A1_TwoSum {
	
	// return indices of the num1 + num2 = target
	public int[] twoSum(int[] nums, int target) {
		// hashmap: index, target - nums[i] -> 7:1 2.2 > taget, skip, 3:3 4:2 2:4
		
		HashMap<Integer, Integer> map = new HashMap<>();
		int[] result = new int[2];
		
		for(int i = 0; i< nums.length; i++) {
			if(map.containsKey(nums[i])) {
				result[0] = map.get(nums[i]); // 1st index == value 
				result[1] = i; //2nd index == key
				break;				
			}
			map.put(target - nums[i], i);
			
		}
		return result;
	}
	
	public int[] twoSum2(int[] nums, int target) {	
		
		HashMap<Integer, Integer> map = new HashMap<>();
		int[] result = new int[2];
		
		for(int i = 0; i< nums.length; i++) {
			int remaining = target - nums[i];
			if(map.containsKey(remaining)) { //key == nums[i] 7:1 - 2:2 t=9 9-2==7
				result[0] = map.get(remaining);
				result[1] = i;
			}
			map.put(nums[i], i);
			
		}
		return result;	
	}
	
}
