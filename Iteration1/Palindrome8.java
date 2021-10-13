package rememberStringPrograms.Iteration1;

public class Palindrome8 {

    public static boolean palindrome(String str) {
        int i = 0;
        int j = str.length() - 1;

        while (j > i) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String args[]) {
        if (palindrome("dadaaa")) {
            System.out.println("This is a palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }
}
