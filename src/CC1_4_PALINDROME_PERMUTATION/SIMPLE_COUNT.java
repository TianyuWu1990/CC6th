package CC1_4_PALINDROME_PERMUTATION;

public class SIMPLE_COUNT {

    public static boolean isPermutationOfPalindrome(String phrase) {
        int countOdd = 0;
        int[] table = new int[Character.getNumericValue('z') - Character.getNumericValue('a') + 1];
        for (char c : phrase.toCharArray()) {
            int x = CommonMethod.getCharNumber(c);
            if (x != -1) {
                table[x]++;

                if (table[x] % 2 == 1) { //reduce a method for checking odd chars
                    countOdd++;
                } else {
                    countOdd--;
                }
            }
        }
        return countOdd <= 1;
    }

    public static void main(String[] args) {
        String pali = "Ratzs live on no evil starz";
        System.out.println(isPermutationOfPalindrome(pali));
        String pali2 = "Zeus was deified, saw Suez";
        System.out.println(isPermutationOfPalindrome(pali2));
    }


}
