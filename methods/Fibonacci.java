package methods;
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = in.nextInt();
        Series(n);
    }
    static void Series(int n) {
        int a = 0;
        int b = 1;
        int sum=0;
        while(a<=n){
            System.out.print(a+ " ");
            sum =a+b;
            a = b;
            b = sum;
        }
        System.out.println();
        System.out.println(sum);
    }
}
