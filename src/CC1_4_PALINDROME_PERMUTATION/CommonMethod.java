package CC1_4_PALINDROME_PERMUTATION;

public class CommonMethod {

    public static int getCharNumber(Character c) {
        int a = Character.getNumericValue('a');
        int z = Character.getNumericValue('z');

        int val = Character.getNumericValue(c); // numeric value of a char is [10, 35]

        if (a <= val && val <= z) {
            return val - a;
        }
        return -1; //not a char
    }

    public static int[] buildCharFrequencyTable(String phrase) {

        int[] table = new int[Character.valueOf('z') - Character.getNumericValue('a') + 1];
        for (char c : phrase.toCharArray()) {
            int x = getCharNumber(c);
            if (x != -1) {
                table[x]++; // count appearance time of a - z
            }
        }
        return table;
    }

}
