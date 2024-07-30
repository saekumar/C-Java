package Tutorial1;

import java.util.Scanner;

public class Atcoder {
    public static void main(String[] args) {
         Scanner sc =new Scanner(System.in);
         int n=sc.nextInt();
         int ar[]=new int[n];
         for(int i=0;i<n;i++)
         {
            ar[i]=sc.nextInt();

         }
         int k=0;
         for (int i = 0; i < n-1; i++) {
            if(ar[i]!=ar[i+1])
            {
                System.out.println("No");
                k=1;
                break;
            }
            
         }
         if(k==0)
         {
            System.out.println("Yes");
         }
    }
}
