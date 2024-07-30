package Tutorial1;

import java.util.*;

public class HashMap_Check {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);


         int t=sc.nextInt();
       while(t-->0)
       {
           int a=sc.nextInt();
           int b=sc.nextInt();
           int ar[]=new int[a];
           int br[]=new int[b];
           for(int i=0;i<a;i++)
           {
               ar[i]=sc.nextInt();
           }
           for(int i=0;i<b;i++)
           {
               br[i]=sc.nextInt();
           }
           System.out.println(check(ar,br,a,b));
       }
        sc.close();
    }

    public static int check(int[] ar, int[] br, int a, int b) {


        HashMap<Integer,Integer> hasha = new HashMap<>();
        HashMap<Integer,Integer> hashb = new HashMap<>();
        for(int i=0;i<a;i++)
        {
            hasha.put(ar[i],1+hasha.getOrDefault(ar[i], 0));


        }
        for(int i=0;i<a;i++)
        {
            hashb.put(br[i],1+hashb.getOrDefault(br[i], 0));


        }
        int c=0;
        
        for(int x:hasha.keySet())
        {
            if(hashb.containsKey(x))
            {
                c+=Math.max(hasha.get(x),hashb.get(x));
               

            }
        }

        return c;
    }
    
}
