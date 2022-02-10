package rememberStringPrograms.LeetCode.Arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class cointainsDuplicate_217 {

    public static boolean cointainsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i : nums){
            if(!set.add(i)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] word = {1,2,3,1};
        boolean a = cointainsDuplicate(word);
        System.out.println(a);
    }
}
