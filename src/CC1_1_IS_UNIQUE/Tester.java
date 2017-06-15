package CC1_1_IS_UNIQUE;

/*
If we can't use additional data structures, we can do the following:
1. Compare every character of the string to every other character of the string.
This will take O( n2) time
and 0 (1) space.
2. If we are allowed to modify the input string, we could sort the string in
O( n log( n» time and then linearly check the string for neighboring characters
that are identical. Careful, though: many sorting algorithms take up extra space.
 */
public class Tester {

    public static void main(String[] args) {
        String[] words = {"abcde", "hello", "apple", "kite", "padle"};
        for (String word : words) {
            boolean wordA = BOOLEAN_CHAR_SET.isUniqueChars(word);
            boolean wordB = BIT_VECTOR.isUniqueChars(word);
            if (wordA == wordB) {
                System.out.println(word + ": " + wordA);
            } else {
                System.out.println(word + ": " + wordA + " vs " + wordB);
            }
        }
    }
}
