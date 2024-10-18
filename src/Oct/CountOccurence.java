package Oct;
import java.util.HashMap;
public class CountOccurence {
    public static void main(String[] args) {
         String myStr="Pallavi    Sharma";
        System.out.println("STring is"+myStr);

        HashMap<Character,Integer> hashMap= new HashMap<>();

         for(int i=myStr.length()-1;i>=0;i--)
         {
             if(hashMap.containsKey(myStr.charAt(i)))
             {
                 int count=hashMap.get(myStr.charAt(i));
                 hashMap.put(myStr.charAt(i),
                         ++count);
             }
             else
             {
                 hashMap.put(myStr.charAt(i),1);
             }

         }
        System.out.println("Occurence is"+hashMap);
    }

}
