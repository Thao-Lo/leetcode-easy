package DSA_Medium;

import java.util.ArrayList;
import java.util.List;

public class S78_Subsets {
	// input [0,1,2] -> output [] [0] [1] [2] [0,1] ..
	
	public List<List<Integer>> subsets(int[] nums) {

		List<List<Integer>> list = new ArrayList<>();
		//start with empty list [ [] ]
		list.add(new ArrayList<Integer>());
		
		for (int i = 0; i < nums.length; i++) {
			int size = list.size(); //loop over the current size
			
			for (int j = 0; j < size; j++) {
				// make a copy of each sublist
				List<Integer> sub = new ArrayList<>(list.get(j));
				//[ [], [] add 0, [] add 1, [0] add 1 -> [0,1] ]
				sub.add(nums[i]);				
				list.add(sub); //size keep increasing
			}
		}

		return list;
	}

}
