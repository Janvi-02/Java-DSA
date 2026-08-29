package methods;
import java.util.Scanner;
public class ProductOfNumbers {
    void product(double i, double j){
        System.out.println(i*j);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number1: ");
        double a = sc.nextDouble();
        System.out.println("enter a number2: ");
        double b = sc.nextDouble();
        ProductOfNumbers obj = new ProductOfNumbers();
        obj.product(a,b);
    }
}
