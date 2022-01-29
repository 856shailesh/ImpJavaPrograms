package rememberStringPrograms.LeetCode.Strings;
//longest substring len in a string

import java.util.HashSet;

public class String_3 {

    public static int lengthOfLongestSubstring(String s) {
        int a_pointer = 0;
        int b_pointer = 0;
        int max = 0;

        HashSet<Character> hashset = new HashSet();
        while (b_pointer < s.length()) {
            if (!hashset.contains(s.charAt(b_pointer))) {
                hashset.add(s.charAt(b_pointer));
                System.out.println(hashset);
                b_pointer++;
                max = Math.max(hashset.size(), max);
            } else {
                hashset.remove(s.charAt(a_pointer));
                a_pointer++;
            }
        }
        return max;
    }


    public static void main(String[] args) {
        String word1 = "shshaileesh";

        int b = lengthOfLongestSubstring(word1);
        System.out.println(b);

    }
}
