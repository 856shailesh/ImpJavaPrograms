package rememberStringPrograms.ImpJavaPrograms.LeetCode.Strings.easy;

//1844. Replace All Digits with Characters

public class replaceDigitwithChar1844 {
    public static String replaceDigits(String s) {
        char[] charArr = s.toCharArray();
        for(int i = 1; i< charArr.length; i += 2){
            charArr[i]= (char) (charArr[i-1]+ charArr[i]- '0');
        }
        return String.valueOf(charArr);
    }

    public static void main(String[] args) {
        String word = "a1b2c3d4e";
        String b = replaceDigits(word);
        System.out.println(b);

    }
}

