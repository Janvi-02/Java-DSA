package methods;

import java.util.Scanner;

public class isPalindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        check(n);
    }
    static void check(int n){
        int temp = n;
        int num = 0;
        while(temp>0){
            int digit = temp%10;
            temp = temp/10;
            num = (num*10) + digit;
        }
        System.out.println(num == n);
    }
}
