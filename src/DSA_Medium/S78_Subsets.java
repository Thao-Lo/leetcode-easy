package DSA_Medium;

import java.util.List;
import java.util.ArrayList; 

// input [0,1,2] -> output [] [0] [1] [2] [0,1] ..
//
public class S78_Subsets {
	public List<List<Integer>> subsets(int[] nums) {

		List<List<Integer>> list = new ArrayList<>();

		//loop through nums[]
		// 
		for(int i = 0; i < nums.length; i++) {
			
			
			for(int j = 0; j <= i; j++) {
				List sub = new ArrayList<>();
				
				
			}
		}
		
		
		return null;

	}
}
