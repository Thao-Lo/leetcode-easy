package DSA_Easy;

public class Recursive_509_Fibonacci_Number {
	// f(0) = 0, f(1) = 1
	//f(n) = f(n-1) + f(n-2) -> n > 1
	
	
	// On
	public int fib(int n) {	
		if(n == 0) return 0;
		if(n == 1) return 1;			
		
		int first = 0; 
		int second = 1;
		
		for(int i = 2; i <= n; i++) {
			int sum = first + second;
			first = second;
			second = sum;			
		}		
		return second;
	}
	
	//O(2^n)
	public int fib1(int n) {		
		if(n == 0) return 0;
		if(n == 1) return 1;			
		
		return fib(n-1) + fib(n-2);
	}

}
