package DSA_Medium;

public class atoi8_StringToInteger {

	public static void main(String[] args) {

	}

	public int myAtoi(String s) {
		int num = 0;
		int sign = 1;
		boolean isStarted = false;

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			
			if (ch == ' ' && !isStarted) // keep going if still whitespace
				continue;
			
			if (!isStarted && (ch == '-' || ch == '+')) { //not start counting yet and see "- or +" 
				sign = ch == '-' ? -1 : 1;  //if ch = -1 -> negative
				isStarted = true; // -> start counting from now
				continue;
			}

			if (ch < '0' || ch > '9') // start counting and encounter non-digit -> stop looping
				break;
			
			isStarted = true; //encounter digit, start counting			
			int digit = ch - '0'; // get value '0' == 48
			// out of range check
			if (num > Integer.MAX_VALUE / 10 || (num == Integer.MAX_VALUE / 10 && digit > 7)) {
				return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
			}
			num = num * 10 + digit; // 12 -> (0 * 10 + 1) -> (1 * 10) + 2
		}

		return num * sign; //positive 12 * 1 or negative 12 * -1
	}
	// Problem:
	// "42" -> 42 // " -042" -> -42 // "1337c0d3" -> 1337
	// "0-1" -> 0 //"words and 987" -> 0
	// leading whitespace, 0 start after sign , read sign for positive or negative
	// reading stop when encounter non-digit

	// Solution
	// ASCII: -: 43, + 45
	// ch >= 48 && ch <= 57 -> ch is a digit
	// ch == ' ' or Character.isWhitespace(ch) for ' ' , '\n\', '\t\','\r'

	// loop through each char, skip all the white space, check for sign, all numbers
	// break when encounter non-digit char
	// store number: x = x * 10 + digit
}
