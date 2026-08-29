package methods;
import java.util.Scanner;
public class PrimeOrNot {
    static void isPrime(int n){
        if(n <=1){
            System.out.println("Number is not prime");
            return;
        }
        for(int i=2;i<Math.sqrt(n);i++) {
            if (n % i == 0) {
                System.out.println("Number is not prime.");
                return;
            }
        }
        System.out.println("Number is Prime");
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        isPrime(num);
    }
}

