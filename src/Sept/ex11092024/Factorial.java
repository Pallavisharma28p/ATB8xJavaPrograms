package Sept.ex11092024;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args)
    {   int n=3,output=1;
        int i=1;
        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter number for Factorial");

        int number= scanner.nextInt();

        while(number>=1)
        {
            output=output*i;
            number--;
            i++;

        }
        System.out.println("Factorial is:"+output);
    }

}
