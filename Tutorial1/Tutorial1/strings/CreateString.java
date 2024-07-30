package Tutorial1.strings;
import java.util.*;
/**
 * CreateString
 */
public class CreateString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
       System.out.println( createStr(n,k,s));
        
    }

    private static String createStr(int n, int k, String s) {
        String str = "";
        HashMap<Character,Integer> hash = new HashMap<>();
        ArrayList<Character> list = new ArrayList<>();
        for(char x:s.toCharArray())
        {
            hash.put(x,hash.getOrDefault(x, 0)+1);
        }
        for(char x: hash.keySet())
        {
            if(hash.get(x)>=k)
            {
                for(int i=0;i<k;i++)
                {
                    list.add(x);
                    System.out.println(x);

                }
            }
        }
        Collections.sort(list);
        for(int i=list.size()-1;i>=0;i--)
        {
            System.out.print(list.get(i)+" ");
            str+=list.get(i);
            System.out.println(str);
        }





        return str;
        
    }
    
        // code here
}