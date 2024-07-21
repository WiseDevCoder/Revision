package SortingTechnique;

public class BubbleSort {


/*
    The process here is simple, we compare 2 values of the array sequentially
    We move the bigger value to right side of the array.

    ex. 13 46 24 54 20

    1.) 13 24 46 20 54
    2.) 13 24 20 46 54
    3.) 13 20 24 46 54
 */
    public static void function(int []arr){

        for(int i = 0 ; i < arr.length ; i++){

            for(int j = 1 ; j < arr.length - i ; j++){

                if(arr[j-1] > arr[j]){
                    swap(arr, j-1, j);
                }

            }

        }

    }

    private static void swap(int[]arr, int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
