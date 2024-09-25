package Sept.ex23092024;

import java.util.Scanner;
public class SwitchCalcuator {

    public static void main(String[] args) {


        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter 1st number");
        int num1=scanner.nextInt();
        System.out.println("Enter 2nd number");
        int num2=scanner.nextInt();
        System.out.println("Hello !!!! Please enter your choice of calculation required- +,-,*,/,%");
        //String operator= scanner.next();
        char operator=scanner.next().charAt(0);

        switch(operator)
        {
            case '+':
            System.out.println("Sum is \n" + num1+num2);
            break;
            case '-':
                System.out.println("Substraction is \n" + (num1-num2));
                break;
            case '*':
                System.out.println("Multiplication is \n" + (num1*num2));
                break;
            case '/':
                System.out.println("Division is \n" + (num1/num2));
                break;
            case '%':
                System.out.println("Modulus is \n" + (num1%num2));
                break;
            default:
                System.out.println("Not a valid choice\n");
        }







    }
}
