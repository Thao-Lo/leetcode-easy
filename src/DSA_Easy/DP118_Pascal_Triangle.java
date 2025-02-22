package DSA_Easy;

import java.util.ArrayList;
import java.util.List;

public class DP118_Pascal_Triangle {

	public static void main(String[] args) {
		List<List<Integer>> outList = generate(1);
		
		for(List<Integer> list : outList) {
			System.out.print("[");
			for(int i : list) {
				System.out.print(i);
				System.out.print(", ");
			}
			System.out.print("]");
		}
	}

	public static List<List<Integer>> generate(int numRows) {		
		List<List<Integer>> outList = new ArrayList<>();
		List<Integer> firstRow = new ArrayList<>();
		firstRow.add(1);
		outList.add(firstRow);  //outList.add(new ArrayList<Integer>(Arrays.asList(1)));	
		
		if (numRows == 1) {
			return outList;
		}
		// base case start with numRows >= 2
		List<Integer> secondRow = new ArrayList<>();
		secondRow.add(1);
		secondRow.add(1);
		outList.add(secondRow);
		
		for (int i = 2; i < numRows; i++) {
			List<Integer> prevRow = outList.get(i - 1); // [1,1]
			List<Integer> nextRow = new ArrayList<>();
			nextRow.add(1);
			for (int j = 1; j < prevRow.size(); j++) { //2
				nextRow.add(prevRow.get(j - 1) + prevRow.get(j));
			}
			nextRow.add(1);
			outList.add(nextRow);
		}

		return outList;
	}
}
