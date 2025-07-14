package DSA_Easy;

public class A704_BinarySearch {

	// sorted array + target number -> Ologn
	// target exist? index : -1

	public int search(int[] nums, int target) {
		if (nums.length == 1) {
			return nums[0] == target ? 0 : -1;
		}
		return binarySearch(nums, target, 0, nums.length - 1);
	}

	public static int binarySearch(int[] nums, int target, int left, int right) {
		if(left > right) {
			return -1;
		}
		int mid = left + (right - left) / 2;
		if (target == nums[mid]) {
			return mid;
		}
		if (target < nums[mid]) {
			return binarySearch(nums, target, left, mid - 1);
		} else {
			return binarySearch(nums, target, mid + 1, right);
		}

	}
}
