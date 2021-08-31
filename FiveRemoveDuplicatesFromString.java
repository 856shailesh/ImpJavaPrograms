package rememberStringPrograms;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;

public class FiveRemoveDuplicatesFromString {

	public static void removeDuplicate(String str) {

		LinkedHashSet<Character> lhs = new LinkedHashSet<Character>();

		for (int i = 0; i < str.length(); i++) {
			lhs.add(str.charAt(i));
		}

		for (Character ch : lhs) {
			System.out.print(ch);
		}

	}
	
	public static void removeDupliInteger(int[] arr) {
		// char[] arr = str.toCharArray();

		Set<Integer> set = new LinkedHashSet<Integer>();
		for (int i = 0; i < arr.length; i++) {
			set.add(arr[i]);
		}
		for (Integer e : set) {
			System.out.print(e);
		}
	}

	public static void main(String[] args) {
		//double i = 1233212124;
		String str = "shailesh";
		
		//String str = String.valueOf(i); // Convert int to String
		removeDuplicate(str);
		
		
		System.out.println(" ");
		int arr[] = { 1, 2, 5, 1, 7, 2, 4, 2 };
		removeDupliInteger(arr);
	}
}
