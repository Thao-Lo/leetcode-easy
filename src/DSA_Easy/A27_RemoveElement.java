package DSA_Easy;

import java.util.ArrayList;
import java.util.List;

public class A27_RemoveElement {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 2, 4, 2, 5, 2 };

		int output = removeElementOne(nums, 2);
		System.out.println("k: " + output);
	}

	public static int removeElementOne(int[] nums, int val) {
		int k = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != val) {
				nums[k] = nums[i];
				k++;
			}
		}
		return k;
	}
	public static int removeElementTwo(int[] nums, int val) {
		int i = 0;
		int k = nums.length - 1;
		while(i <= k) {
			if(nums[i] == val && nums[k] != val) {
				int temp = nums[i];
				nums[i] = nums[k];	
				nums[k] = temp;							
				i++;
				k--;
			}else if(nums[i] != val) {
				i++;
			}else if(nums[k] == val) {
				k--;
			}			
		}	
		
		return i;
	}
	
}
