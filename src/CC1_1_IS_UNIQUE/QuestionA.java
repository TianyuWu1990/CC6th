package CC1_1_IS_UNIQUE;

public class QuestionA {
	public static boolean isUniqueChars(String str) {
		if (str.length() > 128) { // ASCII regular 128 char, extended has 256
			return false;
		}
		boolean[] char_set = new boolean[128]; //true/false indicates whether the character is already used
		for (int i = 0; i < str.length(); i++) {
			int val = str.charAt(i); // set character into integer
			if (char_set[val]) return false;

			char_set[val] = true;
		}
		return true;
	}
	
	public static void main(String[] args) {
		String[] words = {"abcde", "hello", "apple", "kite", "padle"};
		for (String word : words) {
			System.out.println(word + ": " + isUniqueChars(word));
		}
	}

}
