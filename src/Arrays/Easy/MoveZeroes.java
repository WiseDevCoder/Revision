package Arrays.Easy;

public class MoveZeroes {

    /**
     * Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
     *
     * Note that you must do this in-place without making a copy of the array.
     *
     *
     *
     * Example 1:
     *
     * Input: nums = [0,1,0,3,12]
     * Output: [1,3,12,0,0]
     * Example 2:
     *
     * Input: nums = [0]
     * Output: [0]
     * @param arr
     */

    public static void function(int []arr){

        /**
         * imagine using a snowball
         *
         * Whenever we find a 0 we increase the size of the snowball, and swap the elements in this format
         *
         *
         */

        int snowBallSize = 0;

        for(int i = 0 ; i < arr.length ; i++){

            if(arr[i] == 0){
                snowBallSize++;
            }else if(snowBallSize > 0){
                int t = arr[i];
                arr[i] = 0;
                arr[i - snowBallSize] = t;
            }

        }

    }

}
