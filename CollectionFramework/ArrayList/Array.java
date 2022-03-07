package rememberStringPrograms.CollectionFramework.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        //fixed size and hold primitive and object(String)
        int[] ar = new int[4];
        ar[0]= 1;
        ar[1]= 2;


        int[] ar1 = {1,2,3,4};

        System.out.println(ar1[1]);
        System.out.println(ar1.length);



        //only hold nonPrimitve data type like object (Strings) , primitive with Wrapper class
        ArrayList<String> arList = new ArrayList<>();
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("John","Chris"));

        System.out.println(arrayList.get(1));
    }
}
