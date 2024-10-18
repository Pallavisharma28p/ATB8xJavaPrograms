package Oct.ex18102024;

public class Palindrome {
    public static void main(String[] args) {
        String input="masarati";
        boolean output=isPallindrome(input);
        if(output==true){
        System.out.println("yes");}
        else {
            System.out.println("no");
        }
    }

    public static boolean isPallindrome(String input)
    {
        String rev="";
        input=input.toLowerCase();
        boolean result=false;
        for(int i=input.length()-1;i>=0;i--)
        {
            rev=rev+input.charAt(i);
        }
        if(input.equals(rev))
        {
            result=true;
        }
        return result;
    }
}
