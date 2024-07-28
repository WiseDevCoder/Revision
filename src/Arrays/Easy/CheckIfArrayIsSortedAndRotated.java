package Arrays.Easy;

public class CheckIfArrayIsSortedAndRotated {

//    Given an array check if the array is sorted, and rotated

//    Given an array nums, return true if the array was originally sorted in
//    non-decreasing order, then rotated some number of positions (including zero).
//    Otherwise, return false.
//
//    There may be duplicates in the original array.
//
//    Note: An array A rotated by x positions results in an array B of the same length
//    such that A[i] == B[(i+x) % A.length], where % is the modulo operation.

    public static boolean function(int []arr){

        int k = 0 ;

        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] > arr[(i + 1) % (arr.length)]){
                k++;
            }
        }

        return k <= 1;

    }

}
