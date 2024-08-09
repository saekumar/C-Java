package Tutorial1.Math;
import java.util.*;
public class DigitOccu {
    public static void main(String[] args) {
        int n = 10012;
        check(n);
    }

    private static void check(int n) {
        HashMap<Integer,Integer> hash = new HashMap<>();
        while(n>0)
        {
            int rem = n%10;
            
          
            hash.put(rem,hash.getOrDefault(rem, 0)+1);
          
            n/=10;
        }
        // for(int x:hash.keySet())
        // {
        //     System.out.println(x+" "+hash.get(x));
        // }
        System.out.println();
        System.out.println(hash);
        
    }
    
}
