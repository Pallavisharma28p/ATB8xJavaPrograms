package Oct;
import java.util.HashMap;
public class Occ {
    public static void main(String [] args)
    {
        String myStr="Vihaan Sharma";
        HashMap <Character,Integer> hashMap=new HashMap<> ();

        for(int i=myStr.length()-1;i>=0;i--)
        {
            if(hashMap.containsKey(myStr.charAt(i)))
            {
                int count=hashMap.get(myStr.charAt(i));
                hashMap.put(myStr.charAt(i),++count);

            }
            else
            {
               hashMap.put(myStr.charAt(i),1);
            }
        }
        System.out.println("Occ"+hashMap);
    }

}
