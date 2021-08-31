package rememberStringPrograms;

import java.util.Arrays;

public class FourAnagram {

	public static void main(String[] args) {
		String str1 = "Army";
		String str2 = "Mary";
		
		char[] cr1 = str1.toLowerCase().toCharArray();
		char[] cr2 = str2.toLowerCase().toCharArray();
		Arrays.sort(cr1);
		Arrays.sort(cr2);
		
		if(Arrays.equals(cr1, cr2)) {
			System.out.println("These are anagram");
		}else {
			System.out.println("These are not anagram");
		}
		
	}

}
