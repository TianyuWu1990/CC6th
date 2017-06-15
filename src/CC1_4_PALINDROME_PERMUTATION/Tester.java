package CC1_4_PALINDROME_PERMUTATION;

public class Tester {


    public static void main(String[] args) {
        String[] strings = {"Rats live on no evil star",
                "A man, a plan, a canal, panama",
                "Lleve",
                "Tacotac",
                "asda"};
        for (String s : strings) {
            boolean a = CHAR_ARRAY_SET.isPermutationOfPalindrome(s);
            boolean b = SIMPLE_COUNT.isPermutationOfPalindrome(s);
            boolean c = BIT_COUNT.isPermutationOfPalindrome(s);
            System.out.println(s);
            if (a == b && b == c) {
                System.out.println("Agree: " + a);
            } else {
                System.out.println("Disagree: " + a + ", " + b + ", " + c);
            }
            System.out.println();
        }

    }

}
