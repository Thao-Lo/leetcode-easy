package DSA_Easy;

import java.util.HashMap;

public class MajorityElement169 {

	public static void main(String[] args) {
		int[] nums = {2,2,1,1,1,2,2};
		
		int output = findMajority(nums);
		System.out.print("Output: " + output);
		
	}
	public static int findMajority(int[] nums) {
		if(nums.length == 1 || nums.length == 2 ) {
			return nums[0];
		}
		double halfArray = Math.ceil(nums.length/2.0);
		HashMap<Integer, Integer> map= new HashMap<>();
		for(int i = 0; i< nums.length; i++) {
			if(!map.containsKey(nums[i])) {
				map.put(nums[i], 1);
			}else {
				map.put(nums[i], map.get(nums[i]) + 1);
			}
			if(map.get(nums[i]) >= (int)halfArray) {
				return nums[i];
			}			
		}
		
		return 0;
	}
}
