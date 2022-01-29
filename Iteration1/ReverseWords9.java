package rememberStringPrograms.Iteration1;

public class ReverseWords9 {

    public static void reverse(String str){
        String[] arr =  str.split(" ");
        for(int i = arr.length -1 ; i>=0; i--){
            System.out.println(arr[i]);
        }

    }

    public static void main(String[] args) {
        String str = "I love my India";
        reverse(str);
    }
}
