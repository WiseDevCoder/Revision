package BasicMaths;

public class CheckPalindrome {

    /*
    Given an integer x, return true if x is a palindrome, and false otherwise.

    1.) Reverse the entire number and then check or,
    2.) Reverse half the number and then check
    */

    public static boolean function(int n){

        if(n < 0 || (n != 0 && n % 10 == 0)){
            return false;
        }

        int reverse = 0;

        while(n > reverse){
            reverse = reverse*10 + n % 10;
            n = n / 10;
        }

//        If the number is even then it will be a clean reversed number, else
//        if the number is odd then it would be required that we divide the number
//        by 10 otherwise one number would be bigger than the other.
        return (n == reverse) || (n == reverse/10);

    }

}
