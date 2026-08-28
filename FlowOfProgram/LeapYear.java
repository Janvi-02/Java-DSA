package FlowOfProgram;
import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int b = sc.nextInt();
        System.out.println(isLeapYear(b));
    }
    static boolean isLeapYear(int a){
        return ((a%400 == 0)||(a%4 == 0 && a%100!= 0));
    }
}
