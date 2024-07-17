package SortingTechnique;

public class SelectionSort {


    public static void function(int []arr){

        for(int i = 0 ; i < arr.length ; i++){

            int min = i; //This holds the value of the minimum index.

            for(int j = i ; j < arr.length ; j++){

                if(arr[j] < arr[min]){
                    min = j; //When a greater number is found swap the value of INDEX with it.
                }

            }

//            Finally swap the value of first index with the value of least element's index.
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;

        }

    }

}
