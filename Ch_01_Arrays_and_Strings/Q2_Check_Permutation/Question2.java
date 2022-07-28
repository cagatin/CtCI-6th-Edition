import java.util.Arrays;

/* Task: Given two strings, determine if one is a permutation of another 
 * Permutation --> String which contains the same characters of another string.
 * Permutation strings don't have to follows the same order.
 * 
 * Example:
 * checkPermutation('god', 'dog');  --> returns true
 * checkPermutation('book', 'website') --> returns false
 * checkPermutation('abcd', 'dbac') --> returns true
*/

public class Question2 {
    // function used to sort a string
    public static String sort(String s) {
        char[] letters = s.toCharArray();
        Arrays.sort(letters);
        return new String(letters);
    }

    public static boolean checkPermutation(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        return Question2.sort(str1).equals(Question2.sort(str2));
    }

    public static void main(String[] args) {
        String str1 = "god";
        String str2 = "dog";
        System.out.println(Question2.checkPermutation(str1, str2));
    }
}
