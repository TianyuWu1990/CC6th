package CC1_2_CHECK_PERMUTATION;

/*
We can also use the definition of a permutation-two words with the same character counts-to imple- ment this algorithm.
We simply iterate through this code, counting how many times each character appears. Then, afterwards, we compare the two arrays.
 */
public class INT_LETTER_SET {
    public static boolean permutation(String s, String t) {
		if (s.length() != t.length()) return false; // Permutations must be same length

        // Assumption: ASCII. In your interview, you should always check with your interviewer about the
        // size of the character set. We assumed that the character set was ASCII.
        int[] letters = new int[128];
        for (int i = 0; i < s.length(); i++) {
            letters[s.charAt(i)]++; // use array letters to store letter appearance times
        }
		  
		for (int i = 0; i < t.length(); i++) {
			letters[t.charAt(i)]--;
		    if (letters[t.charAt(i)] < 0) {
		    	return false;
		    }
		}

        return true; // letters array has no negative values, and therefore no positive values either, since length equal
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
