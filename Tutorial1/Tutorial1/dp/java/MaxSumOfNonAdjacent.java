package Tutorial1.dp.java;
import java.util.*;
public class MaxSumOfNonAdjacent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
       System.out.println( TopDown(arr));
    }

    private static int TopDown(int[] arr) {
        
        int ar[] = new int[arr.length];
        ar[0] = arr[0];
        ar[1] = arr[1];
        for(int i=2;i<ar.length;i++)
        {
            int first = ar[i-2]+arr[i];
            int second = Integer.MIN_VALUE;
            if(i>2)
            {
                second = ar[i-3]+arr[i];
            }
            ar[i]= Math.max(first, second);
        }
        return ar[ar.length-1];
    }

}
