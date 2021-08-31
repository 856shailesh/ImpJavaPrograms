package rememberStringPrograms;

public class SevenFirstFourLastFourString {

	public static void subStringFour(String str) {
		String firstPart = str.substring(0, 4);
		System.out.println("first part is : " + firstPart);
		String lastPart = str.substring(str.length() - 4, str.length());
		System.out.println("Last four char are : " + lastPart);
		String middlePart = str.substring(4, str.length() - 4);
		System.out.println("Middle part is :" + middlePart);
	}

	public static void main(String[] args) {
		String str = "www.google.com";
		subStringFour(str);
	}

}
