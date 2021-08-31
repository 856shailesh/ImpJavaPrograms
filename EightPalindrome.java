package rememberStringPrograms;

public class EightPalindrome {

	public static boolean palindrome(String str) {
		int i = 0;
		int j = str.length() - 1;

		while (i < j) {
			if (str.charAt(i) != (str.charAt(j))) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

	public static void main(String[] args) {
		if (palindrome("ababaaa")) {
			System.out.println("this is a palindrome");
		} else
			System.out.println("Not a plaindrome");

	}

}
