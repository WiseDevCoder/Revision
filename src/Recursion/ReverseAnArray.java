package Recursion;

public class ReverseAnArray {

//    Reverse an array recursively

    public static void function(int []arr, int i, int j){

        if(i>=j){
            return;
        }

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        function(arr, ++i, --j);


    }

}
