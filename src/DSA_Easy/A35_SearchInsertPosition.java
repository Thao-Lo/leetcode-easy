package DSA_Easy;

import java.util.Arrays;

public class A35_SearchInsertPosition {
	// sorted array, distinct integers + target value
	// return: index of target value, if not return where it should be
	// O(log n) -> binary search

	public int searchInsert(int[] nums, int target) {
		if (nums.length == 1) {
			return target == nums[0] ? 0 : 1;
		}
		return binarySearch(nums, target, 0, nums.length - 1);
	}

	public int binarySearch(int[] nums, int target, int left, int right) {
		if (left > right) {
			return left; //insert position
		}
		// mid at half right must have offset
		int mid = left + ((right - left) / 2);

		if (target == nums[mid]) {
			return mid;
		}
		if (target < nums[mid]) {
			return binarySearch(nums, target, left, mid - 1);
		} else {
			return binarySearch(nums, target, mid + 1, right);
		}

	}

	// Use Arrays.copyOfRange -> On
	public int searchInsert1(int[] nums, int target) {
		int mid = nums.length / 2;

		if (nums.length == 1) {
			return target == nums[0] ? 0 : 1;
		}
		if (target == nums[mid]) {
			return mid;
		}

		if (target > nums[mid] && target < nums[mid + 1]) {
			return mid + 1;
		}

		if (target < nums[mid]) {
			return searchInsert(Arrays.copyOfRange(nums, 0, mid), target);
		} else {
			int index = searchInsert(Arrays.copyOfRange(nums, mid, nums.length), target);
			return mid + index;
		}

	}
}

// recursive searching for index position
// compare values with target value 
// 