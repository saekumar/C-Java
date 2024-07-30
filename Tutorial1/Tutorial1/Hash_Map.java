package Tutorial1;
// given a string ..count the occurency of each alphabet.
import java.util.*;
public class Hash_Map {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
    String s=sc.nextLine();
    check(s);
    sc.close();
    }
    public static void check(String s)
    {
        Map<Character,Integer> hash=new LinkedHashMap<>();
        for(int i=0;i<s.length();i++)
        {
            if(hash.containsKey(s.charAt(i)))
            {
                hash.put(s.charAt(i), hash.get(s.charAt(i))+1);

            }
            else{

                hash.put(s.charAt(i), 1);
            }
        }
        for(Map.Entry<Character,Integer> k:hash.entrySet())
        {
            System.out.println(k.getKey()+" "+k.getValue());
        }
        int max=0;
        char te='a';
        for(char ch:hash.keySet())
        {
            if(hash.get(ch)>=max)
            {
                max=hash.get(ch);
                te=ch;
            }


        }
        System.out.println(te+" : "+max);
       
       
       
        

    }

    
}
