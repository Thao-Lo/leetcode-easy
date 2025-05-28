package DSA_Easy;

public class A283_MoveZeroes {
	
	//shift all Zeroes to the end & keep the order of numbers
	public void moveZeroes(int[] nums) {
		// 2 pointers first/0 second/1		
		if(nums == null || nums.length <= 1) return;
		
		int fir = 0;
		int sec = 1;
		
		while(sec < nums.length) {
			if(nums[fir] != 0) {
				fir++;
			}
			else if(nums[sec] != 0){				
				nums[fir] = nums[sec];
				nums[sec] = 0;
				fir++;
				
			}
			sec++;	
		}
	}

}
