package methods;
import java.util.Scanner;
public class Grades {
    static void marksy(float m){
        if(m>100 || m<1) System.out.println("Invalid marks");
        if(90.5<=m || m<=100) System.out.println("AA");
        else if(80.5<=m|| m<90.5) System.out.println("AB");
        else if(70.5<=m|| m<80.5) System.out.println("BB");
        else if(60.5<=m|| m<70.5) System.out.println("BC");
        else if(50.5<=m|| m<60.5) System.out.println("CD");
        else if(40.5<=m|| m<50.5) System.out.println("DD");
        else System.out.println("Fail");
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter grades b/w (0-100): ");
        float marks = sc.nextFloat();
        marksy(marks);
    }
}
