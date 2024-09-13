package Sept.ex13092024;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter first number");
        int num1= scanner.nextInt();
        System.out.println("Enter second number");
        int num2=scanner.nextInt();

        System.out.println("Sum is :"+ (num1+num2));
        System.out.println("Sub is :"+ (num1-num2));
        System.out.println("Multiplication is :"+ (num1*num2));
        System.out.println("Division is :"+ (num1/num2));
        System.out.println("Fractor is :"+ (num1%num2));
    }
}
