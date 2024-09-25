package Sept.ex25092024;
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        int output=1;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number  for factorial");
        int number=scanner.nextInt();
int i=1;
        while(number>=1)
        {
            output=output*i;
            number--;
            i++;
        }
        System.out.println("Factorial is "+output);
    }
}
