package rememberStringPrograms;

import java.util.HashMap;

public class OneCountwordinSentence {

	public static void main(String[] args) {
		String str = "I am am am Shailesh Kumar Kumar";
		// Output I = 1 , am =3

		HashMap<String, Integer> map = new HashMap<String, Integer>();
		Integer count = 1;
		String[] arr = str.split(" ");  //[I , am , am , shailesh ...]
		for (int i = 0; i < arr.length; i++) {
			if (!map.containsKey(arr[i])) {
				map.put(arr[i], count);
			} else {
				map.put(arr[i], map.get(arr[i]) + 1);
			}
		}
		for (String e : map.keySet()) {
			System.out.println("Count of word " + e + " = " + map.get(e));
		}
	}
}
