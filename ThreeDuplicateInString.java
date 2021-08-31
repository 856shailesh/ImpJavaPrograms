package rememberStringPrograms;

import java.util.HashMap;
import java.util.Map;

public class ThreeDuplicateInString {

	public static void duplicateFinder(String str) {
		char[] arr = str.toCharArray(); // [l,a,p,t,o,p]

		Map<Character, Integer> map = new HashMap<Character, Integer>();
		Integer count = 1;
		for (int i = 0; i < arr.length; i++) {
			if (!map.keySet().contains(arr[i])) {
				map.put(arr[i], count);
			} else {
				map.put(arr[i], map.get(arr[i])+1);
			}
		}
		for(Character key : map.keySet()) {
			if(map.get(key)>1) {
				System.out.println(key + " : " + map.get(key));
			}
		}
	}

	public static void main(String[] args) {

		duplicateFinder("laptop");
		duplicateFinder("    ");

	}

}
