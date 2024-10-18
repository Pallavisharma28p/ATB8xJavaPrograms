package Oct.ex18102024;

public class Reverse {
    public static void main(String[] args) {
        String input="Pallavi";
        String output=reverse(input);
        System.out.println("Reverse is "+output);
    }
    public static String reverse(String input)
    {
        String rev="";
        input=input.toLowerCase();
        for(int i=input.length()-1;i>=0;i--)
        {
            rev=rev+input.charAt(i);
        }
        return rev;
    }


}
