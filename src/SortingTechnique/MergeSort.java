package SortingTechnique;

public class MergeSort {


//    1 3 4 2 10

    public static void merge(int []arr){

        int n = arr.length;

        if(n < 2){
            return;
        }

        int mid = n/2;

        int []l = new int[mid];
        int []r = new int[n-mid];

        for(int i = 0 ; i < mid ; i++){
            l[i] = arr[i];
        }

        for(int i = mid ; i < n; i++){
            r[i - mid] = arr[i];
        }

        merge(l);
        merge(r);

        mergeSort(arr, l, r);

    }

    private static void mergeSort(int []arr, int []l, int []r){

        int temp = 0, i = 0, j = 0;

        while(i < l.length && j < r.length){
            if(l[i] <= r[j]){
                arr[temp++] = l[i++];
            }else{
                arr[temp++] = r[j++];
            }
        }

        while(i < l.length){
            arr[temp++] = l[i++];
        }

        while(j < r.length){
            arr[temp++] = r[j++];
        }

    }

}
