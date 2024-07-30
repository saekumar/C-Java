

package Tutorial1;

import java.util.*;

/**
 * Sliding_Window
 */
public class Sliding_Window {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int k=sc.nextInt();
            int ar[]=new int[n];
            for(int i=0;i<n;i++)
            {
                ar[i]=sc.nextInt();
            }
      solve(ar, k);
            
      
            
        }
        sc.close();
    }

    public static void solve(int[] ar, int k) {
        // int arr[]=new int[10];
   int st=0,end=k-1,n=ar.length-1;
   while(end<n)
   {
    Map<Integer,Integer> hash =new HashMap<>();
    int i=st,j=end;
    while(i<=j)
    {
        hash.put(ar[i],1+hash.getOrDefault(ar[i], 0));
        i++;
    }
     System.out.println(hash.size());
    hash.clear();
    st++;
    end++;
   }

        
           
        
    }
}