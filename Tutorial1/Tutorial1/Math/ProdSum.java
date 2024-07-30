package Tutorial1.Math;

import java.util.*;

/**
 * ProdSum
 */
public class ProdSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        check(n,arr);
    }

    public static void check(int n, int[] arr) {
      int sum = 0,prod =0,c=0;
      for(int i=0;i<n;i++)
      {
        sum = arr[i];
        prod = arr[i];
        for(int j=i+1;j<n;j++)
        {
            sum+=arr[j];
            prod*=arr[j];
            if(sum==prod)
            {
                c++;
            }

        }
      }
      System.out.println(c);
    }
}