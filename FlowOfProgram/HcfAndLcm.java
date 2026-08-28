package FlowOfProgram;
import java.util.Scanner;
public class HcfAndLcm {
    int hcf(int a, int b) {
        while(b!=0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a int number: ");
        int a = sc.nextInt();
        System.out.println("enter b int number: ");
        int b = sc.nextInt();
        HcfAndLcm hc = new HcfAndLcm();
        int h = hc.hcf(a, b);
        int l = (a*b)/h;
        System.out.println(hc.hcf(a,b));
        System.out.println(l);
    }
}
