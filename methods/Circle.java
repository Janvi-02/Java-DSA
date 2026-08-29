package methods;
import java.util.Scanner;
public class Circle {
    static void Circumference(float r){
        System.out.println("Circumference: "+2*Math.PI*r);
    }
    static void Area(float r ){
        System.out.println("Area: "+Math.PI*Math.pow(r,2));
    }
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        System.out.println("enter the radius lenght: ");
        float radius = sc.nextFloat();
        Circle.Circumference(radius);
        Circle.Area(radius);
    }
}
