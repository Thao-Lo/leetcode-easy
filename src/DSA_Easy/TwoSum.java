package DSA_Easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TwoSum {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("please enter array size: "); 
		int arrayLength = keyboard.nextInt();
		
		int[] nums = new int[arrayLength];
		
		for(int i = 0; i < arrayLength; i++) {			
			System.out.print("Enter numbers " + i + " : ");
			nums[i] = keyboard.nextInt();			
		}
		System.out.print("Enter target number: ");
		int target = keyboard.nextInt();
		
		int[] resultArray = twoSumHash(nums, target);		
		
		System.out.print(Arrays.toString(resultArray));		

	}
	
	//Brute Force
	 public static int[] twoSum(int[] nums, int target) {
		 
		 int index1 = 0;
		 int index2 = 0;
		 
		 for(int i = 0; i < nums.length; i++) {
			 for(int j = i + 1; j < nums.length; j++ ) {
				 if(nums[j] + nums[i] == target) {
					 index1 = i;
					 index2 = j;
				 }				 
			 }
		 }
		 int[] resultArray = {index1, index2};		
		 
		 return resultArray;
	 }
	 
	 public static int[] twoSumHash(int[] nums, int target) {
		    HashMap<Integer, Integer> numToIndex = new HashMap<>();

		    for (int i = 0; i < nums.length; i++) {
		        int complement = target - nums[i]; 
		        if (numToIndex.containsKey(complement)) {
		            return new int[]{numToIndex.get(complement), i};
		        }
		        numToIndex.put(nums[i], i); 
		    }
		    

		    // If no solution is found, return an empty array or throw an exception
		    // based on your requirements.
		    return new int[]{};
		}

}
//Binary search! for sorted array only 
