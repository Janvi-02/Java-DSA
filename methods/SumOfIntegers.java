package methods;
import java.util.Scanner;
public class SumOfIntegers {
    public static double sum(double a, double b){
        return a+b;
    }
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a number1: ");
       double a1 = sc.nextDouble();
        System.out.println("Enter a number2: ");
        double a2 = sc.nextDouble();
       System.out.println(SumOfIntegers.sum(a1,a2));
    }
}
