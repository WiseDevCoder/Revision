package SortingTechnique;

public class InsertionSort {

    public static void function(int []arr){

        for(int i = 0 ; i < arr.length ; i++){
            int min = i;
            for(int j = i ; j < arr.length ; j++){
                if(arr[j] < arr[min]){
                    min = j;
                }
            }

//            Now I have the index of the smallest value in the array.

            int val = arr[min];

            while(min > i){
                arr[min] = arr[min - 1];
                min--;
            }

            arr[i] = val;

        }
    }

}
