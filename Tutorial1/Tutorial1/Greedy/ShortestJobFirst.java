package Tutorial1.Greedy;

import java.util.*;

public class ShortestJobFirst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        
        System.out.println(sjf(arr,n));
        sc.close();
    }

    public static int sjf(int[] arr, int n) {

        int tot = 0;
        Arrays.sort(arr);
        for(int i=0;i<n;i++)
        {
            tot+= (n-i-1)*(arr[i]);
        }



        return (tot/n);
       
    }
    
}
