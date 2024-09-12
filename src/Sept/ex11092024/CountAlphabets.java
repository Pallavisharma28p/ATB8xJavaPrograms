package Sept.ex11092024;

public class CountAlphabets {
    public static void main(String [] args)
    {
        int count=0,countDigit=0,countSpace=0;
        String name="Pallavi SHarma 28 p";
        char[] c2= name.toCharArray();
        for (int i=0;i<name.length();i++)
        {
            boolean answer=Character.isAlphabetic(c2[i]);
            boolean answer2=Character.isDigit(c2[i]);
            boolean answer3=Character.isSpaceChar(c2[i]);
            if (answer==true)
            {
                count++;
            }
            if(answer2==true)
            {
                countDigit++;
            }
            if(answer3==true)
            {
                countSpace++;
            }

        }
        System.out.println("Total Alphabets are "+count);
        System.out.println("Total Digits are "+countDigit);
        System.out.println("Total Spaces are "+countSpace);
    }
}
