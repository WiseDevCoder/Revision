package Arrays.Easy;

public class MissingNumber {

    /**
     * Given an array nums containing n distinct numbers in the range [0, n],
     * return the only number in the range that is missing from the array.
     * @param arr
     */

    public static void function(int []arr){

        int n = arr.length;

        int sum1 = n*(n+1)/2;

        int sum = 0;
        for(int i : arr){
            sum+=i;
        }

        System.out.println(sum1 - sum);

    }

}
