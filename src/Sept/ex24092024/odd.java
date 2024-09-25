package Sept.ex24092024;

public class odd {
    public static void main(String[] args) {
        int i,flag=0;

        for(i=0;i<=50;i++)
        {
            if(i%2==0)
            {
                System.out.println(i +" Even number");
                continue;
            }
            System.out.println(i + " Odd number");
        }
    }
}
