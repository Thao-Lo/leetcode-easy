package DSA_Easy;

public class QuickSort {

	public static void main(String[] args) {
		int[] arr = { 7, 2, 1, 6, 8, 5, 3, 4 };
		System.out.println("Original array:");
		printArray(arr);
		quickSort(arr, 0, arr.length - 1);
		System.out.println("\nSorted array:");
		printArray(arr);
	}
	public static void printArray(int arr[]) {
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	public static void quickSort(int[] arr, int begin, int end) { // dau tien se dua vi tri cua partionIndex vao dung vi tri trong array
		if(begin<end) {
			int partitionIndex = partition(arr, begin, end);
			quickSort(arr, begin, partitionIndex -1); // trong function co fuction, recursion, toi khi nao begin = end 
			quickSort(arr, partitionIndex+1, end);
		}		
	}

	public static int partition(int[] arr, int begin, int end) {
		int pivot = end;
		int i = begin - 1; // 0-1=-1

		for (int j = begin; j < end; j++) {
			if (arr[j] <= pivot) {
				// j=0
				// j=1 - yes => i++ i = 0
				//j=2 - yes - i = 1 => arr[2,1,7,...]
				//j=3, 4,5 => no				
				//j = 6 - yes = i= 2 => arr[2,1,7,6,8,5,3,4] => doi cho j= 6 voi i = 2 => tuc 7 va 3 
				//new array => arr[2,1,3,6,8,5,7,4]				
				i++;
				int y = arr[i];
				arr[i] = arr[j];
				arr[j] = y;
				//i = 0 => value = 7 => y = 7 
				//j=1 => value = 2 => a[i/0] = 2
				//ar[1/2] = 7
				//=> doi cho 7 va 2 cho nhau
			}
			int y = arr[i+1];
			arr[i+1] = arr[end];
			arr[end] = y;
		}
		return i+1; // vi tri cua pivot sau khi dc sort va phan mang
	}
}
