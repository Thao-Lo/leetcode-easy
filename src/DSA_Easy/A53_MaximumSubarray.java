package DSA_Easy;

public class A53_MaximumSubarray {
	
	// find subArray with the largest sum
	// return: its sum
	// nums = [-2,1,-3,4,-1,2,1,-5,4] || nums = [5,4,-1,7,8]
	
	//dynamic programming 
	public int maxSubArray(int[] nums) {
		int localMax = 0;
		int globalMax = 0;
		
		for(int i = 0; i < nums.length; i++) {		
			localMax += nums[i];
			if(localMax >= globalMax) {
				globalMax = Math.max(localMax, globalMax); //compare with current globaMax
				
			}else {
				localMax = 0; //localmax < 0
			}
		}		
		return globalMax;
	}
}
