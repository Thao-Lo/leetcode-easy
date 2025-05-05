package DSA_Medium;

public class II7_ReverseInteger {

	public static void main(String[] args) {

	}
	// INTEGER MANIPULATION
	// DIGIT EXTRACTION

	public int reverse(int x) {
		int reverseNum = 0;

		while (x != 0) {
			int digit = x % 10; // Java keep sign of number -> -11%10 = -1
			x = x / 10;
			// 2,147,483,647
			if (reverseNum > Integer.MAX_VALUE / 10 || (reverseNum == Integer.MAX_VALUE / 10 && digit > 7)) {
				return 0;
			}
			// -2,147,483,648
			if (reverseNum < Integer.MIN_VALUE / 10 || (reverseNum == Integer.MIN_VALUE / 10 && digit < -8)) {
				return 0;
			}
			reverseNum = reverseNum * 10 + digit;
		}
		return reverseNum;
	}

}
// check like palindrome?
// x = originalNum; reverseNum = 0
// digit = originalNum %10, reverseNum *= 10 + digit; originalNum /10;
// out off range signed 32 bit -> return 0
// for negative number, need a bit to hold a sign? 
// -> bit manipulation + palidrome?