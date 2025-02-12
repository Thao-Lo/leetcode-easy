package DSA_Easy;

import java.util.LinkedList;
import java.util.Queue;

public class A88_Merge_Sorted_Array {

	public static void main(String[] args) {
		int[] nums1 = { 0 };
		int[] nums2 = { 1 };
		int m = 0, n = 1;
//		mergeWithQueue(nums1, m, nums2, n);
		merge(nums1, m, nums2, n);
		for (int i : nums1) {
			System.out.print(i + ", ");
		}
	}

	// not using Queue
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		int i = m - 1; // last index of nums1 except 0
		int j = n - 1; // last index of nums2
		int k = m + n - 1; // last index
		while (i >= 0 && j >= 0) {
			if (nums1[i] > nums2[j]) {
				nums1[k] = nums1[i];
				i--;
			} else {
				nums1[k] = nums2[j];
				j--;
			}
			k--;
		}
		// when only j left, the rest of k will be replaced by j
		while (j >= 0) {
			nums1[k] = nums2[j];
			j--;
			k--;
		}
	}

	// queue -> so complicated, must use debug to fix it
	public static void mergeWithQueue(int[] nums1, int m, int[] nums2, int n) {
		Queue<Integer> queue = new LinkedList<>();
		int j = 0, i = 0;

		while (i < m + n) {
			// still in nums2
			if (j < n) {
				// if have nums1 element in queue
				if (!queue.isEmpty()) {
					if (nums2[j] < queue.peek()) { // num2 < peek -> add i to peak, nums1 = nums 2, j++
						// still within m, not at 0
						if (i < m) {
							// add nums[i] to queue, and appoint nums1[i] = nums2[j]
							queue.offer(nums1[i]);
							nums1[i] = nums2[j];
							j++;
						} else { // nums1[i] start with 0
							nums1[i] = nums2[j];
							j++;
						}

					} else { // nums 2 >= peak, store nums[i], nums[i] = smallest number in queue
						if (i < m) { // still in nums1
							queue.offer(nums1[i]);
							nums1[i] = queue.poll(); // get smallest number in queue to nums1[i]
						} else { // out of nums1, just appoint queue element to nums[i] (0)
							nums1[i] = queue.poll();
						}

					}
				} else { // no number in queue
					// if nums1 > nums 2, nums1 = nums2, nums1 store in queue, j++
					if (nums1[i] > nums2[j]) {
						queue.offer(nums1[i]); // add nums1 to queue
						nums1[i] = nums2[j]; // nums1 at i becomes nums2[j]
						j++;
					} else {
						nums1[i] = nums2[j]; // nums1 at i becomes nums2[j]
						j++;
					}
				}
				i++;
			} else { // only nums1 left, no more nums2 elements
				queue.offer(nums1[i]);
				i++;
			}
		}

		i = m + n - queue.size(); // 6 - 0 or 6 - 2(0,0)
		while (!queue.isEmpty()) {
			// replace 0 with numbers in queue
			nums1[i] = queue.poll();
			i++;
		}

	}

}
