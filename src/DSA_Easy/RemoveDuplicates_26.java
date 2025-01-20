package DSA_Easy;

public class RemoveDuplicates_26 {

	public static void main(String[] args) {
		int[] nums = { 1, 1, 2, 2, 3 };

	}

	//44.78MB
	public int removeDuplicates(int[] nums) {
		int k = 0;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] != nums[k]) {
				k++;
				nums[k] = nums[i];
			}
		}

		return k + 1;
	}
	
	//44.47MB 82.44% - runtime 1ms 79.75%
	
	public int removeDuplicates2(int[] nums) {
		int k = 1;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] != nums[i-1]) {				
				nums[k] = nums[i];
				k++;
			}
		}

		return k;
	}
}
