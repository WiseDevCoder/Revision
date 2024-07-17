package BasicMaths;

public class HCF {

//    Find the highest common factor for the given 2 numbers

    public static void function(int a, int b){

        while(a>0&&b>0){

            if(a > b){
                a = a%b;
            }else{
                b = b % a;
            }

        }

        if(a == 0){
            System.out.println(b);
        }else{
            System.out.println(a);
        }

    }

}
