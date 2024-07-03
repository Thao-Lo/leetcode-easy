package DSA_Easy;

import java.util.Random;

public class QuickSort2 {

	public static void main(String[] args) {
		Random rand = new Random();
		int[] numbers = new int[10];

		int[] testArray = {3, 6, 8, 10, 1, 2, 1};
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = rand.nextInt(100); // number from 0-100

		}
		quickSort(numbers);
		
		
		quickSort(testArray);
		printArray(testArray);
	}

	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

	public static void quickSort(int[] array) {
		quickSort(array, 0, array.length - 1);
	}

	// method Overloading - same name but different parameters
	public static void quickSort(int[] array, int startIndex, int endIndex) {
		if (startIndex >= endIndex) {
			return;
		}
		
//		int pivotIndex = new Random().nextInt(endIndex - startIndex) + startIndex;
//		int pivot = array[pivotIndex];
//		swap(array, pivotIndex, endIndex);
		
		// int pivot = array[array.length -1];
		int pivot = array[endIndex];
		
		
		//alt-shift-M 
		//leftPointer or rightPointer - index when finish sort each time
		int leftPointer = partition(array, startIndex, endIndex, pivot); 

		quickSort(array, startIndex, leftPointer - 1);
		quickSort(array, leftPointer + 1, endIndex);
	}

	private static int partition(int[] array, int startIndex, int endIndex, int pivot) {
		int leftPointer = startIndex;
		int rightPointer = endIndex - 1; 
		while (leftPointer < rightPointer) {
			while (array[leftPointer] <= pivot && leftPointer < rightPointer) {
				leftPointer++;
			}
			while (array[rightPointer] >= pivot && leftPointer < rightPointer) {
				rightPointer--;
			}
			swap(array, leftPointer, rightPointer); // swap numbers/values, not index
		}
		
		//	int[] testArray = {3, 6, 8, 10, 1, 2, 1};
		 if(array[leftPointer] > array[endIndex]) {
		      swap(array, leftPointer, endIndex);
		    }
		    else {
		      leftPointer = endIndex;
		    }
	
		//swap(array, leftPointer, endIndex); // swap with value of pivot
		return leftPointer;
	}

	// parameters are indices, and result is the swap values of 2 numbers based on
	// index of that number
	public static void swap(int[] array, int index1, int index2) {
		int temp = array[index1]; // temp hold value of array[index1]

		array[index1] = array[index2]; // value of array[index1] now is change to the value of array[index2]
		// at this point value of 2 index is the same

		array[index2] = temp; // value of array[index2] now is value of temp

	}
}
