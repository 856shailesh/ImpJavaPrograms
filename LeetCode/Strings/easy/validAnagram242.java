package rememberStringPrograms.LeetCode.Strings.easy;

public class validAnagram242 {
    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        char[] c1 = s.toCharArray();
        char[] c2 = t.toCharArray();
        int[] alpha = new int[26];

        for(int i=0 ; i < c1.length ; ++i){
            alpha[c1[i] - 'a']++;
            alpha[c2[i]- 'a']--;
        }
        for(int num: alpha){
            if(num != 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String word = "abc";
        String word2 = "bca";
        boolean a = isAnagram(word,word2);
        System.out.println(a);
    }
}
