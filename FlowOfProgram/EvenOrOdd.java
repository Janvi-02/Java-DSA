package FlowOfProgram;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //1. Even Or Odd
//        int a = sc.nextInt();
//        if(a%2==0){
//            System.out.println("even");
//        }
//        else{
//            System.out.println("odd");
//        }

        //2. Greeting message
//        String name = sc.next();
//        System.out.println("Hello "+ name);
//
//        //Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
//        float p = sc.nextFloat();
//        float t = sc.nextFloat();
//        float r = sc.nextFloat();
//        float result = (p*r*t)/100;
//        System.out.println(result);

        //3. Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
//        System.out.print("Enter 1st number: ");
//        float a = sc.nextFloat();
//        System.out.print("Enter 2nd number: ");
//        float b = sc.nextFloat();
//        System.out.print("Enter an operator (+, -, *, /): ");
//        char c = sc.next().charAt(0);
//        if(c == '+'){
//            System.out.println(a+b);
//        }
//        else if(c == '-'){
//            System.out.println(a-b);
//        }
//        else if(c == '*'){
//            System.out.println(a*b);
//        }
//        else if(c == '/'){
//            if(b!= 0){
//                System.out.println(a/b);
//            }
//            else{
//                System.out.println("Cannot be divided by zero");
//            }
//        }
//        else{
//            System.out.println("Invalid input operator");
//        }

        //4. Take 2 numbers as input and print the largest number.
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        if(a>b){
//            System.out.println(a);
//        }
//        else if(b>a){
//            System.out.println(b);
//        }
//        else{
//            System.out.println("Both are equal");
//        }

        //5. Input currency in rupees and output in USD.
        //1 USD = 83 INR
//        System.out.print("Enter number: ");
//        float num = sc.nextFloat();
//        float result = num*83;
//        System.out.println(result);

//       6. To calculate Fibonacci Series up to n numbers.
//         System.out.print("Enter a number till you want to print the fibbonacci series: ");
//         int number = sc.nextInt();
//         int a = 0;
//         int b = 1;
//         for(int i=0;i<=number;i++){
//             System.out.print(a+" ");
//             int temp = a;
//             a = b;
//             b = temp+b;
//         }
//       7. To find out whether the given String is Palindrome or not.
//        Every time you do this:
//
//        Java creates a new string
//        Copies old data + new character
//
//        👉 For length n, this becomes O(n²) (slow)
//
//        Correct approach → StringBuilder
//        Logic
//        1.Create empty StringBuilder
//        2.Add characters using .append()
//        3.Convert to string at the end
//        System.out.print("Enter a word: ");
//        String word = sc.next();
////        String result = "";
//        StringBuilder result = new StringBuilder();
//        for(int i = word.length()-1; i>=0 ; i--){
//            result.append(word.charAt(i));
//        }
//        if(word.equals(result.toString())){
//            System.out.println("The given word is a Palindrome");
//        }
//        else{
//            System.out.println("The given word is not a Palindrome");
//        }

//       8. To find Armstrong Number between two given number.
        System.out.print("Enter 1st number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int num2 = sc.nextInt();
        int count = 0;
        while (num1 > 0) {
            int a = num1 % 10;
            count++;
            num1 = num1 / 10;
        }
        int result = 0;
        for(int i=num1; i<=num2; i++){
            result += (int) Math.pow((i%10),count);
            if(result == i){
                System.out.println("The Armstrong number is: "+ i);
                break;
            }
        }
        System.out.println("There is no Armstrong number between the entered numbers");
    }

}
