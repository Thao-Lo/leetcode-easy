package DSA_Easy;

public class RemoveDuplicates27 {

	public static void main(String[] args) {
		int[] nums = { 1, 1, 2 };

		int[] expectedNums = new int[nums.length];
		int num = nums[0];
		expectedNums[0] = num;
		int k = 1;

		for (int i = 1; i < nums.length; i++) {
			if (nums[i] > num) {
				num = nums[i];
				expectedNums[k] = num;
				k++;
			}
		}
		System.out.println("k: " + k);
		for (int j = 0; j < expectedNums.length; j++) {
			System.out.print(expectedNums[j] + " ");
		}
	}
}
