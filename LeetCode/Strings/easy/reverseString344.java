package rememberStringPrograms.ImpJavaPrograms.LeetCode.Strings.easy;

public class reverseString344 {
    public static void reverseString(char[] s) {
        String str = "";
        for (int i = s.length-1; i >= 0; i--) {
            str = str + s[i];
        }
        for(int i=0; i<s.length; i++)      /*Set reversed 'str' into char array 's' */
            s[i] = str.charAt(i);
    }
    public static void main(String[] args) {
        String word = "shailesh";
        char[] word1 = word.toCharArray();
        reverseString(word1);
        //System.out.println(b);

    }
}
