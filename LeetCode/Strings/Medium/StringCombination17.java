package rememberStringPrograms.ImpJavaPrograms.LeetCode.Strings.Medium;

//permutation and combination kind of problem

import java.util.LinkedList;
import java.util.List;

public class StringCombination17 {

    public static List<String> letterCombinations(String digits) {
        LinkedList<String> ans = new LinkedList<String>();
        if (digits.isEmpty()) return ans;
        String[] mapping = new String[]{"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
        ans.add("");

        for(int i =0; i< digits.length(); i++){
            int index = Character.getNumericValue(digits.charAt(i));
            while (ans.peek().length()== i){
                String permutation = ans.remove();
                for (char c : mapping[index].toCharArray()){
                    ans.add(permutation + c);
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String word = "23";
        List<String> b = letterCombinations(word);
        System.out.println(b);

    }
}
