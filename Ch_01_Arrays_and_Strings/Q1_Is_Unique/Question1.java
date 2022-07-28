package Ch_01_Arrays_and_Strings.Q1_Is_Unique;

import java.util.Set;
import java.util.HashSet;

/* Task: Implement an algorithm to determine if a string has all unique characters*/
public class Question1 {
    public static boolean isUnique(String str) {
        Set<Character> set = new HashSet<Character>();
        for (int i = 0; i < str.length(); i++) {
            if (set.contains(str.charAt(i))) {
                return false;
            }
            set.add(str.charAt(i));
        }
        return true;
    }

    public static void main(String[] args) {
        String[] words = new String[] { "Hello", "World", "Night", "Kitten" };
        for (String word : words) {
            System.out.println(word + ":" + isUnique(word));
        }
    }
}