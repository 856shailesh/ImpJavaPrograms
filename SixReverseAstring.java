package rememberStringPrograms;

public class SixReverseAstring {

	public static void reverse(String str) {
		// char[] cr = str.toCharArray();
		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}

	}

	public static void main(String[] args) {

		String str = "Varsha";
		reverse(str.toLowerCase());
	}

}
