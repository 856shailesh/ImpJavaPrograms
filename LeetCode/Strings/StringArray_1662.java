package rememberStringPrograms.ImpJavaPrograms.LeetCode.Strings;

public class StringArray_1662 {
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sb1 = new StringBuilder();
        for(String str : word1){
            sb1.append(str);
        }
        StringBuilder sb2 = new StringBuilder();
        for(String str : word2){
            sb2.append(str);
        }
        return sb1.toString().equals(sb2.toString());

    }

    public static boolean arrayStringsAreEqual1(String[] word1, String[] word2) {
        int idx1 = 0, idx2 = 0, arrIdx1 = 0, arrIdx2 = 0;
        while (arrIdx1 < word1.length && arrIdx2 < word2.length) {
            if (word1[arrIdx1].charAt(idx1) != word2[arrIdx2].charAt(idx2)) return false;
            if (idx1 == word1[arrIdx1].length() - 1) {
                idx1 = 0;
                arrIdx1++;
            } else idx1++;
            if (idx2 == word2[arrIdx2].length() - 1) {
                idx2 = 0;
                arrIdx2++;
            } else idx2++;
        }
        return arrIdx1 == word1.length && arrIdx2 == word2.length;
    }

    public static void main(String[] args) {
        String[] word1 = {"ab", "c"};
        String[] word2 = {"a", "bc"};
        boolean b = arrayStringsAreEqual(word1, word2 );
        System.out.println(b);
        boolean c = arrayStringsAreEqual1(word1, word2 );
        System.out.println(c);
    }
}
