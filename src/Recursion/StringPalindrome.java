package Recursion;

public class StringPalindrome {

    public static void function(String s, int i, int j){

//        Make sure the input given is in lowercase and has no whitespace
//        The functions to do that would be :-
//        1.) s.toLowerCase()
//        2.) s.replaceAll("//s", k)

//        k => replace k with whatever you want to replace the whitespace with and ensure
//        it is in "double quotes".

//        The //s -> signifies a single whitespace in java,

        if(s.length() <= 1 || s.isBlank()){
            System.out.println(false);
            return;
        }

        if (i >= j){
            System.out.println("true");
            return;
        }

        if(s.charAt(i) == s.charAt(j))
        {
            function(s, ++i, --j);
        }else{
            System.out.println("false");
        }

    }

}
