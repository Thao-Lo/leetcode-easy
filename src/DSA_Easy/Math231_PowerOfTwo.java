package DSA_Easy;

public class Math231_PowerOfTwo {

	// no loop or recursion
	// n = 2 ^ x ? true : false

	public boolean isPowerOfTwo(int n) {
		// odd number, not 1
		if (n == 1 || n == 2) {
			return true;
		}
		if (n % 2 != 0) {
			return false;
		}

		int test = 1;
		while (n > test) {
			test *= 2;
			if (n == test) {
				return true;
			}

		}
		return false;
	}
}
