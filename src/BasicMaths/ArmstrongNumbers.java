package BasicMaths;

public class ArmstrongNumbers {

    /*
        1.) Problem Statement: Given an integer N, return true it is an Armstrong number
        otherwise return false.
        2.) An Amrstrong number is a number that is equal to the sum
        of its own digits each raised to the power of the number of digits.
     */

    public static void function(int n){

        /*
        1.) Count the digits and check the value.
         */

        int num = n;

        int length = String.valueOf(n).length(); // Digit count

        int sum = 0;

        while(n != 0){
            sum = sum + (int)Math.pow(n%10, length);
            n = n / 10;
        }

        System.out.println(sum == num);

    }

}
