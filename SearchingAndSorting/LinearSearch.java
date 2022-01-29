package rememberStringPrograms.SearchingAndSorting;

public class LinearSearch {
    static int arr[] = {10,20,30,40,50};

    public static void linearSearch(int k){
        boolean flag;
        for(int i =0 ; i<= arr.length ; i++){
            if (arr[i]== k){
                flag = true;
                System.out.println("element found at postition : " + i);
                break;
            }
            
        }

    }

    public static void main(String args[]){
        linearSearch(30);
    }
}
