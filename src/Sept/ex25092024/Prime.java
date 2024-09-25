package Sept.ex25092024;
import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {

        int i, m=0,flag=0;

        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter your number");
        int num=scanner.nextInt();
        m=num/2;
        if(num==0 || num==1)
        {
            System.out.println("Not a prime number");
        }
        else
        {
            for(i=2;i<=m;i++)
            {
                if(num%i==0)
                {   flag=1;
                    System.out.println("Not a prime number");
        break;

    }

}
            if(flag==0)
            {
                System.out.println("Prime number");
            }
        }
    }
}
