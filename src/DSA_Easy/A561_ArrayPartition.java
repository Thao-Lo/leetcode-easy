package DSA_Easy;

public class A561_ArrayPartition {
	public static void main(String[] args) {
		int[] nums = { 1, 4, 7, 3, 9, 2 };
		// 1 2 3 4 7 9
		int sum = arrayPartition(nums);
		System.out.print("sum: " + sum);
	}

	public static int arrayPartition(int[] nums) {
		// sort array
			quickSort(nums, 0, nums.length - 1);
		// get the pair and find the min
			int sum = 0;
			for(int i = 0; i < nums.length; i+=2) {
				sum += nums[i];				
			}
		// return max sum
		return sum;
	}

	// find the index of pivot - partition
	public static int partition(int[] nums, int low, int high) {
		// pick the pivot at the last index
		int pivot = nums[high];
		int j = low - 1;

		for (int i = low; i < high; i++) {
			if (nums[i] <= pivot) {
				// increment j only for number smaller than pivot
				j++;
				// swap position of smaller number to larger number
				int temp = nums[i];
				nums[i] = nums[j];
				nums[j] = temp;
			}
		}

		// Place the pivot in its correct position (after the last smaller element)
		int temp = nums[j + 1];
		nums[j + 1] = nums[high];
		nums[high] = temp;

		// pivot index
		return j + 1;
	}

	public static void quickSort(int[] nums, int low, int high) {
		// base case
		if (low < high) {
			int pivotIndex = partition(nums, low, high);
			// Recursively sort the left subarray (elements smaller than the pivot)
			quickSort(nums, low, pivotIndex - 1);
			// Recursively sort the right subarray (elements larger than the pivot)
			quickSort(nums, pivotIndex + 1, high);
		}
	}
}
