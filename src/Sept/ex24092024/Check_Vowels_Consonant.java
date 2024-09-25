package Sept.ex24092024;

import java.sql.SQLOutput;
import java.util.Scanner;
public class Check_Vowels_Consonant {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        // check vowels or consonant when a letter is given
        /*System.out.println("Enter letter");
        char letter = scanner.next().charAt(0);

        switch(letter)
        {
            case 'a','A'-> System.out.println("It is a vowel");
            case 'e','E'-> System.out.println("It is a vowel");
            case 'i','I'-> System.out.println("It is a vowel");
            case 'o','O'-> System.out.println("It is a vowel");
            case 'u','U'-> System.out.println("It is a vowel");
            default-> System.out.println("It is a consonant");
        }*/
        //check vowels or consonants in String.
        System.out.println("Enter String");

        String s=scanner.nextLine();
//String s="Pallavi SHarma";
        int count_of_vowel=0;
        int count_of_cosonant=0;

        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U')
            {
                 count_of_vowel++;
            }
            else
            {
                count_of_cosonant++;
            }

        }
        System.out.println("The total number of Vowels are \s"+ count_of_vowel);
        System.out.println("The total number of consonants are \s"+ count_of_cosonant);
    }
}
