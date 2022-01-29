package rememberStringPrograms.LeetCode.Strings;

//Panagram : cointains every word of english language
public class String_1832 {
    public static boolean checkIfPangram(String sentence) {
        if (sentence.length() < 26) return false;
        for (int i = 1; i <= 26; i++) {
            System.out.println(sentence.indexOf(i));
            if (sentence.indexOf((char) i + 96) < 0)
                return false;
        }
        return true;
    }

    public static boolean checkIfPangram1(String sentence) {
        int seen = 0;
        for(char c : sentence.toCharArray()) {
            int ci = c - 'a';
            seen = seen | (1 << ci);
        }
        return seen == ((1 << 26) - 1);
    }


    public static void main(String[] args) {
        boolean a = checkIfPangram("fffqsdfasdfuickbrownfoxjumpsoverthelazy");
        System.out.println(a);
        boolean b = checkIfPangram1("fffqsdfasdfuickbrownfoxjumpsoverthelazy");
        System.out.println(b);
    }
}
