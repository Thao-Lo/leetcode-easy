package DSA_Easy;

import java.util.HashSet;
import java.util.Set;

public class A217_ContainsDuplicate {
	
	//return true if any values appear twice, else false
	public boolean containsDuplicate(int[] nums) {
		Set<Integer> set = new HashSet<>(nums.length); //avoid set keeps resizing
		for(int num: nums) {
			if(set.contains(num)) {
				return true;
			}
			set.add(num);		
		}
				
		return false;
	}
	
	//OPTIMIZE for large capacity
	public boolean containsDuplicateTwo(int[] nums) {
		Set<Integer> set = new HashSet<>(nums.length); //avoid set keeps resizing (after 75%)
		for(int num: nums) {
			// set can add num, if(false) -> set.add(num)
			//check and add value at the same time 
			if(!set.add(num)) {
				return true;
			}
		}				
		return false;
	}
	
}
