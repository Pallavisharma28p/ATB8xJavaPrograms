package Sept.ex11092024;

public class Factorial {
    public static void main(String[] args)
    {   int n=3,output=1;
        int i=1;
        while(n>=1)
        {
            output=output*i;
            n--;
            i++;

        }
        System.out.println("Factorial is:"+output);
    }

}
