package Arrays.Easy;

public class RotateArray {

    public static void function(int []arr, int k){

        k %= arr.length;

        if(arr.length == 1){
            return;
        }

        int end = arr.length - k; // 4

        rotate(arr, 0, end - 1); // 3
        rotate(arr, end, arr.length - 1);
        rotate(arr, 0, arr.length - 1);

    }

    private static void rotate(int []arr, int si, int ei){

        while(si < ei){
            int temp = arr[si];
            arr[si++] = arr[ei];
            arr[ei--] = temp;
        }

    }

}
