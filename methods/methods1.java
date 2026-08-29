package methods;
import java.util.Scanner;
public class methods1 {
//    public int n;
//    public com.strings.String evenOrOdd(int n){
//        if(n%2==0){
//            return "Number is even";
//        }
//        return "Number is odd";
//    }
//    public int a,b,c;
    int maxi(int a,int b,int c){
        if(a>=b && a>=c){
           return a;
        }
        else if(b>=a && b>=c){
            return b;
        }
        else{
            return c;
        }
    }
    public int mini(int a,int b,int c){
//        if(a==b | a==c)
        if(a<=b && a<=c){
            return a;
        }
        else if(b<=a && b<=c){
            return b;
        }
        else{
            return c;
        }
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number1: ");
        int d = sc.nextInt();

        System.out.println("Enter number2: ");
        int e = sc.nextInt();

        System.out.println("Enter number3: ");
        int f = sc.nextInt();

        methods1 obj = new methods1();

        System.out.println("Max no. = "+obj.maxi(d,e,f));
        System.out.println("Min no. = "+obj.mini(d,e,f));
    }
}
