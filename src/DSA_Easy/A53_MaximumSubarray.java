package DSA_Easy;

public class A53_MaximumSubarray {
	
	// find subArray with the largest sum
	// return: its sum
	// nums = [-2,1,-3,4,-1,2,1,-5,4] || nums = [5,4,-1,7,8]
	
	//dynamic programming 
	//each step: extend the current array? or start a new subarray
	public int maxSubArray(int[] nums) {
		if(nums.length == 1) {
			return nums[0];
		}
		int localMax = 0;
		int globalMax = 0;
		
		for(int i = 0; i < nums.length; i++) {		
			localMax += nums[i];
			if(localMax >= globalMax) {
				globalMax = Math.max(localMax, globalMax); //compare with current globaMax
				
			}else { //localMax < 0
				//localMax = 0; 
				localMax = 0; 
			}
		}		
		return globalMax;
	}
	
	//include negative sum
	public int maxSubArray2(int[] nums) {		
		if(nums.length == 1) {
			return nums[0];
		}
		int localMax = 0;
		int globalMax = nums[0];
		
		for(int i = 1; i < nums.length; i++) {		
			localMax = Math.max(nums[i], localMax + nums[i]); 
			globalMax = Math.max(localMax, globalMax); 			
		}		
		return globalMax;
	}
}

