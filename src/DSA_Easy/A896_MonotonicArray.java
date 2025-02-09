package DSA_Easy;

public class A896_MonotonicArray {

	public static void main(String[] args) {
		int[] asc = { 1, 2, 3, 3, 8, 6 };
		int[] des = { 7, 7, 7, 7, 1 };
		boolean isMonotonic = isMonotonicTwo(asc);
		System.out.print("result: " + isMonotonic);

	}

	public static boolean isMonotonicOne(int[] nums) {
		if (nums.length <= 1) {
			return true;
		}
		int k = 0;
		while (k < nums.length - 1) {
			if (nums[k] != nums[k + 1]) {
				break;
			}
			k++;
		}
		// constant sequence is consider monotonic
		if (k == nums.length - 1) {
			return true;
		}
		if (nums[k + 1] > nums[k]) {
			if (nums[nums.length - 1] < nums[nums.length - 2]) {
				return false;
			}
			for (int i = k; i < nums.length - 1; i++) {
				if (nums[i + 1] < nums[i]) {
					return false;
				}
			}
		}
		if (nums[k + 1] < nums[k]) {
			if (nums[nums.length - 1] > nums[nums.length - 2]) {
				return false;
			}
			for (int i = k; i < nums.length - 1; i++) {
				if (nums[i + 1] > nums[i]) {
					return false;
				}

			}
		}
		return true;
	}

	public static boolean isMonotonicTwo(int[] nums) {
		// 1 element is monotonic
		if (nums.length <= 1) {
			return true;
		}
		boolean increasing = true;
		boolean decreasing = true;

		for (int i = 1; i < nums.length; i++) {
			// either increase or false increase
			if (nums[i] > nums[i - 1]) {
				decreasing = false;
			}
			// either decrease of false decrease
			if (nums[i] < nums[i - 1]) {
				increasing = false;
			}
		}

		// return true in Or condition true || false
		return increasing  || decreasing;
	}

}
