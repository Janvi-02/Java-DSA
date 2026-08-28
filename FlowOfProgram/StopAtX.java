package FlowOfProgram;

import java.util.Scanner;
public class StopAtX {
    public static void main(String[] args){
        //Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.
        Scanner sc = new Scanner(System.in);
//        System.out.println("enter number a: ");
//        int a = sc.nextInt();
//        int sum=0;
//        System.out.print("Enter a number: ");
//        int x = sc.nextInt();
//        while(x != a){
//            System.out.println("enter a number: ");
//            a = sc.nextInt();
//            sum+=a;
//        }
//        System.out.println("Sum of all number till now: "+ sum);

//        System.out.print("enter a Char: ");
//        char a = sc.next().charAt(0);
//        System.out.print("enter x Char: ");
//        char x = sc.next().charAt(0);
//        String sum = "";
//        while(x!=a){
//            System.out.print("enter a number: ");
//            a = sc.next().charAt(0);
//            sum =sum+a;
//        }
//        System.out.println("Sum of all char till now: "+ sum);

        System.out.println("enter a number: ");
        String a = sc.next();
        System.out.println("enter x number: ");
        String x = sc.next();
        String sum = "";
        while(x != a){
            System.out.print("enter a number: ");
            a = sc.next();
            sum =sum + a;
        }
        System.out.println("Sum of all string till now: "+ sum);
    }
}
