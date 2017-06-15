package CC1_2_CHECK_PERMUTATION;

import java.util.Arrays;

/*
 Ask whether case sensitive or not? whitespace is significant or not?
 If two strings are permutations, then we know they have the same characters,
 but in different orders. There- fore, sorting the strings will put the characters
 from two permutations in the same order. We just need to compare the sorted versions
 of the strings.
 */
public class SORT_STRING {

	public static String sort(String s) {

		char[] content = s.toCharArray();
		Arrays.sort(content);
		return new String(content);
	}
	
	public static boolean permutation(String s, String t) {
		return sort(s).equals(sort(t));
	}	
	
	public static void main(String[] args) {
		String[][] pairs = {{"apple", "papel"}, {"carrot", "tarroc"}, {"hello", "llloh"}};
		for (String[] pair : pairs) {
			String word1 = pair[0];
			String word2 = pair[1];
			boolean anagram = permutation(word1, word2);
			System.out.println(word1 + ", " + word2 + ": " + anagram);
		}
	}
}
