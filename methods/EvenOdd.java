package methods;
import java.util.Scanner;
public class EvenOdd {
    static String evenOrOdd(double n){
        if (n%1 !=0){
            return "Neither even nor odd";
        }
        int num = (int)n;
        if(num%2==0){
            return "NUmber is Even";
        }
        else return "NUmber is odd";
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        double n = sc.nextDouble();
        System.out.println(EvenOdd.evenOrOdd(n));
    }
}
