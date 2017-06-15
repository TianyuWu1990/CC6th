package CC1_3_URLIFY;

import CtCILibrary.CtCILibrary.AssortedMethods;

/*
Acommon approach in string manipulation problems is to edit the string starting from the end and working backwards. This is useful
because we have an extra buffer at the end, which allows us to change characters without worrying about what we're overwriting.
We will use this approach in this problem.The algorithm employs a two-scan approach. In the first scan, we count the number of spaces.
By tripling this number, we can compute how many extra characters we will have in the final string. In the second pass, which is done in
reverse order, we actually edit the string.When we see a space, we replace it with %20. If there is no space, then we copy the original character.
 */
public class CHAR_ARRAY {
    // Assume string has sufficient free space at the end
    public static void replaceSpaces(char[] str, int trueLength) {
        int spaceCount = 0, index, i = 0;
        for (i = 0; i < trueLength; i++) {
            if (str[i] == ' ') {
                spaceCount++;
            }
        }
        index = trueLength + spaceCount * 2; // save space for %20
        if (trueLength < str.length) str[trueLength] = '\0'; // #####dont know this line
        for (i = trueLength - 1; i >= 0; i--) {
            if (str[i] == ' ') {
                str[index - 1] = '0';
                str[index - 2] = '2';
                str[index - 3] = '%';
                index = index - 3;
            } else {
                str[index - 1] = str[i]; // move char to the right most available index
                index--;
            }
        }
    }

    // for finding the truelength of a string
    public static int findLastCharacter(char[] str) {
        for (int i = str.length - 1; i >= 0; i--) {
            if (str[i] != ' ') {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String str = "Mr John Smith    ";
        char[] arr = str.toCharArray(); // transfer str into char array for index manipulation
        int trueLength = findLastCharacter(arr) + 1; // length is last char + 1
        replaceSpaces(arr, trueLength);

        System.out.println("\"" + AssortedMethods.charArrayToString(arr) + "\"");
    }
}
