package Tutorial1.Solidify;

import java.util.*;
 class MaxSubArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        int tar = sc.nextInt();
       System.out.println( check(n,arr,tar));
        sc.close();
    }

    private static int check(int n, int[] arr, int tar) {
        int st = 0,end = 0,currSum = 0,ans = 0;
        while(end<n)
        {
            currSum+=arr[end];
            while (currSum>tar) {
                currSum-=arr[st++];
            }
            ans = Math.max(ans,(end-st+1));
            end++;
        }
        return ans;


    }
}
