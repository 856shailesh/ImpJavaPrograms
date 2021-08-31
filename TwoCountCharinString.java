package rememberStringPrograms;

import java.util.HashMap;
import java.util.Map;

public class TwoCountCharinString {

	public static void countString(String str) {

		Map<Character, Integer> map = new HashMap<Character, Integer>();
		char[] arr = str.toCharArray(); // [t,h,i,s, ,i,s, , .....]
		int count = 1;
		for (int i = 0; i < arr.length; i++) {
			if (!map.containsKey(arr[i])) {
				map.put(arr[i], count);
			} else {
				map.put(arr[i], map.get(arr[i]) + 1);
			}
		}
		for (char e : map.keySet())
			System.out.println("Count of " + e + " is :" + map.get(e));
	}

	public static void main(String[] args) {
		String str = "This aaaa is Shailesh Kumar";
		countString(str);
	}

}
