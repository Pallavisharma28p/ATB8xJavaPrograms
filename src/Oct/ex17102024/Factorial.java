package Oct.ex17102024;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number for factorial");
        int number=scanner.nextInt();
        int output=1;
        int i=1;
        while(number>=1)
        {
            output=output*i;
            number--;
            i++;
        }
        System.out.println("Factorial is"+ output);
    }

}
