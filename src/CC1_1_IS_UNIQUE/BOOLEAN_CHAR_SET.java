package CC1_1_IS_UNIQUE;

/*
The time complexity for this code is O( n), where n is the length ofthe string.
The space complexity is O( 1). (You could also argue the time complexity is
O( 1), since the for loop will never iterate through more than 128 characters.}
 If you didn't want to assume the character set is fixed, you could express the
 complexity as o(c)spaceand0(min(c, n))or0(c)time,
 where cisthesizeofthecharacterset.
 */

public class BOOLEAN_CHAR_SET {
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
