package DSA_Easy;

import java.util.HashMap;
import java.util.Map;

public class A697_DegreeOfAnArray {

	public static void main(String[] args) {
		 int[] nums1 = {1, 2, 2, 3, 1};
	        System.out.println(findShortestSubArray(nums1));
	        int[] nums2 = {1, 2, 2, 3, 1, 4, 2};
	        System.out.println(findShortestSubArray(nums2));
	}

	public static int findShortestSubArray(int[] nums) {
//		List<List<Integer>> list = new ArrayList<>();
		// list.get(0).set(0, list.get(0).get(0) + 1) [[1,0],[0,0]]
		// list.get(0).set(1, list.get(0).get(1) + 1) [[1,1], [0,0]]

		Map<Integer, Integer> count = new HashMap<>(); // count degree
		Map<Integer, Integer> first = new HashMap<>(); // count 1st time appear
		Map<Integer, Integer> last = new HashMap<>(); // count last time appear
		int maxDegree = 0;
		int minLength = Integer.MAX_VALUE; //(2^32)
		
		for (int i = 0; i < nums.length; i++) {
			// number and its degree
			count.put(nums[i], count.getOrDefault(nums[i], 0) + 1);
			//number and its 1st index
			first.putIfAbsent(nums[i], i);
			//number and its last index
			last.put(nums[i], i);
		}
		for( int num : count.keySet()) {
			int degree = count.get(num);
			int length = last.get(num) - first.get(num) + 1; //array length need to + 1
			
			if(degree > maxDegree) {
				maxDegree = degree; //get the max degree 4
				minLength = length; // set minLength as a length of that number 3
			}else if( degree == maxDegree) { 
				// degree 2(4) = 3(4) 
				//compare length or minLength = Math.min(minLength, length)
				if(minLength > length) {
					minLength = length;
				}
			}			
		}
		return minLength;
	}
}	

		/*
		 * - find the degree + count degree - + store position - store number - 1
		 * position and last position: length of subarray - same largest degree with
		 * smallest length [0,5,4,5] -> degree 3 - beginning and end 7 1 - beginning and
		 * end 6 -> 6 [[1,5], [5,6], [5,3]]
		 */
	

