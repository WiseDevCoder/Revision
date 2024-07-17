package BasicMaths;

import java.util.Scanner;

public class ReverseANumber {

//    Given a signed 32-bit integer x, return x with its digits reversed.
//    If reversing x causes the value to go outside the signed 32-bit
//    integer range [-2^31, 2^31 - 1], then return 0.

    private static int reverse(int n){
        int num = Math.abs(n);
        int rev = 0;

        while(num!=0){
            int ld = num % 10;
            if(rev > Integer.MAX_VALUE / 10){ //Check for overflow [if the reversed number is greater than 2^31 or not]
                return 0;
            }
            rev = rev * 10 + ld;
            num = num/10;
        }

        return n < 0 ? (-rev) : rev;
    }

}
