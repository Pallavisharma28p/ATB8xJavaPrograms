package Oct.ex17102024;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String input="Pallavi Sharma Got New Job";
        String output=remove(input);
        System.out.println(output);
    }
    public static String remove(String str)
    {
            String result="";
            for(int i=0;i<str.length();i++)
            {
                    char ch=str.charAt(i);
                    if(result.indexOf(ch)==-1)
                    {
                        result+=ch;
                    }
            }
    return result;
    }


}
