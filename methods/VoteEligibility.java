package methods;
import java.util.Scanner;
public class VoteEligibility {
    public static String voteGive(int n){
        if(n>=18) return "He/She can give vote.";
        else return "He/She is not elgible to give vote";
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        System.out.println(VoteEligibility.voteGive(age));
    }
}
