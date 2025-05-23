package DSA_Easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class A1122_RelativeSortArray {
	public static void main(String[] args) {
		int[] arr1 = { 2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19 };
		int[] arr2 = { 2, 1, 4, 3, 9, 6 };

		relativeSortArray1(arr1, arr2);

		for (int i : arr1) {
			System.out.print(i + " ");
		}
	}

	// Counting Sort int[] freq = new int[maxNum + 1];
	public static int[] relativeSortArray1(int[] arr1, int[] arr2) {
		int max = 0;
		for (int num : arr1) {
			if (num > max) {
				max = num;
			}
		}
		// add frequecy to index
		int[] reg = new int[max + 1];
		for (int i = 0; i < arr1.length; i++) {
			reg[arr1[i]]++;
		}
		
		//start from arr2
		int index = 0; //of arr1
		for (int num : arr2) {
			while(reg[num] > 0) {
				arr1[index++] = num;
				reg[num] --;
			}
		}
		//only for index in reg, value > 0
		for(int i = 0; i <= max; i++) {
			while(reg[i] > 0) {
				arr1[index++] = i;
				reg[i] --;
			}
		}
		
		return arr1;
	}

	// using Map
	public static int[] relativeSortArray(int[] arr1, int[] arr2) {
		// arr length = a1 lenght

		// Map<Interger, Integer> map
		Map<Integer, Integer> map = new HashMap<>();

		// num in arr1 as key
		for (int num : arr1) {
			map.put(num, map.getOrDefault(num, 0) + 1);
		}

		int j = 0;
		// num 2 de fill up
		for (int i = 0; i < arr2.length; i++) {
			int req = map.get(arr2[i]); // times
			while (req > 0) {
				arr1[j] = arr2[i];
				j++;
				req--;
			}
			map.remove(arr2[i]);
		}

		int start = j;
		for (int num : map.keySet()) {
			int count = map.get(num);
			while (count > 0) {
				arr1[j] = num;
				count--;
				j++;
			}
		}
		Arrays.sort(arr1, start, arr1.length);

		return arr1;
	}
}

/*
 * arr1: have arr2 number arr2: numbers are distinc arr: arr2 - arr1 - sorted
 * leftover sap xep array1, theo thu tu cua 2, con lai sort tang dan loop qua
 * het 1, store in map loop qua 2 roi lay tu map lap vao array, sau do delete
 * map con lai xet lon be
 */
