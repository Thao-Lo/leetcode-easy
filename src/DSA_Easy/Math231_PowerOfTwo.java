package DSA_Easy;

public class Math231_PowerOfTwo {

	// no loop or recursion
	// n = 2 ^ x ? true : false

	public boolean isPowerOfTwo(int n) {
		// odd number, not 1
		if (n <= 0) {
			return false;
		}
		int test = 1;
		while (n > test) {
			test *= 2;
		}
		return test == n;
	}
	
	//bit manipulation: (n & (n - 1)) == 0
	public boolean isPowerOfTwoUpdated(int n) {
		return n > 0 && (n & (n - 1)) == 0;
	}
}

// 1000 (n: 8) & 0111 (n-1: 7) -> 1 & 0 || 0 & 1 || 0 & 0 == 0
// 1 & 1 == 1; -> not cancel out -> not power of 2