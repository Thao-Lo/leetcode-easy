package DSA_Easy;

import java.util.Arrays;

public class A3046_SplitTheArray {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 2, 2, 3, 4 };
		System.out.print(isPossibleToSplit(nums));
	}

	public static boolean isPossibleToSplit(int[] nums) {		
		int count = 0;
		Arrays.sort(nums);
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] == nums[i - 1]) {
				count++;
			} else {
				count = 0;                                    
			}
			if(count == 2) {
				return false;
			}
		}

		return true;
	}
	public static boolean isPossibleToSplit2(int[] nums) {
		int[] count = new int[101];
		for(int i = 0; i< nums.length; i++) {
			count[nums[i]]++;		//[0,0,0,0]: count[1]++ [0,1,0..], count[1]++ [0,2,0], count[1]++ [0,3,0..]-> false
			if(count[nums[i]] > 2) {
				return false;
			}
		}
		
		return true;
	}

}
