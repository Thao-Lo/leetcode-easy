package DSA_Easy;

import java.util.Scanner;

public class ClimbingStairs {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter top: ");
		int top = keyboard.nextInt();
		
		int output = climbStairs(top);
		System.out.print("the number of ways: " + output);		
	}

	//dynamic array
	public static int climbStairsTwo(int top) {
		if(top == 1) {
			return 1;
		}
		int[] arr = new int[top+1]; //i== top => arr.length > top or == top+1
		
		arr[1] = 1; // number of way to climb 1 level
		arr[2] = 2; //number of way to climb 2 level
		
		for(int i = 3; i <= top; i++) {
			arr[i] = arr[i-1] + arr[i-2];			
		}
		
		return arr[top];
	}
	
	public static int climbStairs(int top) {
		if(top == 1 || top == 2) {
			return 1;
		}
		int[] arr = new int[top+1]; 
		
		arr[1] = 1; 
		arr[2] = 1; 
		arr[3] = 2;
		
		for(int i = 4; i <= top; i++) {
			arr[i] = arr[i-1] + arr[i-3];			
		}
		
		return arr[top];
	}
}
