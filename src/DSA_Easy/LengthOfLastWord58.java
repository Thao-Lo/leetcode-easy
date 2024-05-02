package DSA_Easy;

public class LengthOfLastWord58 {

	public static void main(String[] args) {
		String s = "   fly me   to   the moon   ";

		int output = findLengthOfLastWord(s);
		System.out.println(output); 
	}

	public static int findLengthOfLastWord(String s) {
		//StringBuilder object is an empty string with capacity of 16, never null
		//if want to check it contains character or not, use length()
		StringBuilder output = new StringBuilder();
		
		for (int i = s.length() - 1; i >= 0; i--) {
			if(s.charAt(i) == ' ' && output.length() > 0) {
				break;
				}
			if(s.charAt(i) != ' '){
				output.append(s.charAt(i));
			}				
		}
		
		return output.length();
	}

}
