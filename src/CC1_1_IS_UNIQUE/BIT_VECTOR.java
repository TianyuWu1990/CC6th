package CC1_1_IS_UNIQUE;

/*
We can reduce our space usage by a factor of eight by using a bit vector.
We will assume, in the below code, that the string only uses the lowercase letters
a through z.This will allow us to use just a single into
 */
public class BIT_VECTOR {

	/* Assumes only letters a through z. */
	public static boolean isUniqueChars(String str) {
		if (str.length() > 26) { // Only 26 characters
			return false;
		}
		int checker = 0;
		for (int i = 0; i < str.length(); i++) {
			int val = str.charAt(i) - 'a';
			if ((checker & (1 << val)) > 0){ //set differ between char and 'a' as 1 with differ number's 0s
				return false;
			}
			checker |= (1 << val); // put differs into checker like an array stored 1s and 0s

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
