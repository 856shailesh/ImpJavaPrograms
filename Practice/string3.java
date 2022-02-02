package rememberStringPrograms.Practice;

import java.util.HashSet;

public class string3 {

    public static int lengthOfLongestSubstring(String s) {
        int aPointer = 0;
        int bPointer = 0;
        int max = 0;

        HashSet<Character> hashSet = new HashSet<>();
        while (bPointer < s.length()) {
            if (!hashSet.contains(s.charAt(bPointer))) {
                hashSet.add(s.charAt(bPointer));
                bPointer++;
                max = Math.max(hashSet.size(), max);
            } else {
                hashSet.remove(s.charAt(aPointer));
                aPointer++;
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
