package CC1_4_PALINDROME_PERMUTATION;

public class CHAR_ARRAY_SET {
    //we don't care if the string's length is odd or even, cause 1 odd char indicates the string is odd already, or
    // no odd char then string is even
    public static boolean checkMaxOneOdd(int[] table) {
        boolean foundOdd = false;
        for (int count : table) {
            if (count % 2 == 1) {
                if (foundOdd) {
                    return false;
                }
                foundOdd = true;
            }
        }
        return true;
    }

    public static boolean isPermutationOfPalindrome(String phrase) {
        int[] table = CommonMethod.buildCharFrequencyTable(phrase);
        return checkMaxOneOdd(table);
    }

    public static void main(String[] args) {
        String pali = "Rats live on no evil star!";
        System.out.println(isPermutationOfPalindrome(pali));
    }


}
