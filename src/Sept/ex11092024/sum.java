package Sept.ex11092024;

public class sum {

    public static void main(String[] args)
    {
        int a = add(10,10);
        System.out.println(a);

    }


    static int add(int a, int b)
    {
        for(int i=1;i<=b;i++)
        {
            a++;
        }
        return a;
    }


}
