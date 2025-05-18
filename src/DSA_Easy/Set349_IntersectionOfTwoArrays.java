package DSA_Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Set349_IntersectionOfTwoArrays {
	
	//return intersection but unique elements from 2 arrays
	  public int[] intersection(int[] nums1, int[] nums2) {
		  Set<Integer> set = new HashSet<>();	  
		  Set<Integer> unique = new HashSet<>();	  
		  
	     for(int n : nums1) {
	    	 set.add(n);
	     }
		 
	     for(int m : nums2) {
	    	 if(set.contains(m)) {
	    		 unique.add(m);
	    	 }
	     }
		 int[] result = new int[unique.size()];
		 int i = 0;
		 for(int r : unique) {
			 result[i++] = r;
		 }
		  
		  return result;
	    }
}
// loop through each array
// Set, loop 1st array, store value in set
//loop 2nd array check value in set, then store in return array