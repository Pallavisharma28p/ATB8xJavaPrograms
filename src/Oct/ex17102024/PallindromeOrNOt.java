package Oct.ex17102024;

public class PallindromeOrNOt {
    public static void main(String[] args) {
        String str="babao";
        str=str.toLowerCase();
        boolean A=isPallindrome(str);
        if(A== true) {
            System.out.println("Given string is Pallindrome");
        }
        else {
            System.out.println("Given string is not a Pallindrome");
        }
    }
    public static boolean isPallindrome(String str)
    {
        String rev="";
        boolean ans=false;

        for(int i=str.length()-1;i>=0;i--)
        {
            rev=rev+str.charAt(i);
        }
        if(str.equals(rev))
        {
            ans=true;
        }


        return ans;
    }

}
