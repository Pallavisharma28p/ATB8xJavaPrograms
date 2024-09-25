package Sept.ex20092024;

import java.util.Scanner;

public class MaximunBetweenNumbers {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter first number");
        int num1= scanner.nextInt();
        System.out.println("Enter second number");
        int num2= scanner.nextInt();
        System.out.println("Enter third number");
        int num3= scanner.nextInt();

        int m=(Math.max(num1,num2));

        if(m > num3)
        {
            System.out.println(m+"is max");
        }
        else {
            System.out.println(num3+"is max");
        }


    }
}
