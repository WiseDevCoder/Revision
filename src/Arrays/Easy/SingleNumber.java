package Arrays.Easy;

public class SingleNumber {

    /**
     * Given a non-empty array of integers nums, every element appears twice except for one.
     * Find that single one.
     *
     * You must implement a solution with a linear runtime complexity and use only constant
     * extra space.
     */

    public static void function(int []arr){

        /**
         * Let me explain what XOR IS ->
         *
         * XOR operation runs on the bitwise values of integers.
         *
         * And this operation returns true, when the 2 values that are being compares are not the same
         *
         * So for example, suppose we are comparing 2 numbers 4 and 1, the bitwise values for them would be
         *
         * 0 0 0 1 0 0
         * 0 0 0 0 0 1
         * -----------
         * 0 0 0 1 0 1
         * XOR VALUE IS => 1 0 1 which is 5
         *
         * Another example would be comparing 2 of the same values such as 6 and 6
         *
         * 0 0 0 1 1 0
         * 0 0 0 1 1 0
         * -----------
         * 0 0 0 0 0 0
         * XOR VALUE IS => 0 which is 0
         *
         * Another example would be comparing 1 and 3
         *
         *
         * 0 0 0 0 0 1
         * 0 0 0 0 1 1
         * -----------
         * 0 0 0 0 1 0
         * XOR VALUE IS => 1 0  which is 2
         *
         * Now you must be wondering how is this useful here?
         *
         * Well if 2 values were 2 XOR between themselves, they would return 0.
         * And the input we were given came with specific instructions that,
         * An element would appear once, rest of the elements in the array would appear twice.
         *
         */

        int result = 0;

        for(int i : arr){
            result = result ^ i;
        }

        System.out.println(result);

    }

}
