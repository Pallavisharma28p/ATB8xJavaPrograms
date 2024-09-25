package Sept.ex25092024;
import java.util.Scanner;
public class VowelsConsonant {
    public static void main(String[] args) {


    /*Scanner scanner =new Scanner(System.in);
    System.out.println("Enter your number for table");

    int num=scanner.nextInt();
*/
        int v_count = 0;
        int c_count = 0;
        String name = "Pallavi SHarma";
        for (int i = 0; i <name.length(); i++)
        {
            char ch=name.charAt(i);
            if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U')
            {
                v_count++;
            }
            else
            {
                c_count++;
            }
        }
        System.out.println("Total number of vowels is"+v_count);
        System.out.println("Total number of consonant is"+c_count);
    }
}
