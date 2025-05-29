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
	public void moveZeroes_Two(int[] nums) {		
		if(nums == null || nums.length <= 1) return;
		
		int current = 0;
		
		for(int num : nums) {
			if(num != 0) {
				nums[current++] = num; //shift all numbers to the front
			}			
		}
		while(current < nums.length) {
			nums[current++] = 0;
		}
		
	}
	//nums[current++] = num; -> nums[current] = num; current+=1;

}
