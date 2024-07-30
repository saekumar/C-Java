
package Tutorial1.dp.java;

import java.util.*;

public class FrogJump {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println(recursion(n-1,arr));
        System.out.println(dp(n-1,arr));
        System.out.println(tabulation(n-1,arr));
        System.out.println(Optimised(arr));
        sc.close();
    }

    private static int Optimised(int arr[]) {

        int n = arr.length;
        int prev = 0,prev2 = 0;
        for(int i=1;i<n;i++)
        {
            int left = prev + Math.abs(arr[i]-arr[i-1]);
            int right = Integer.MAX_VALUE;
            if(i>1)
            {
                right  = prev2 + Math.abs(arr[i]-arr[i-2]);
            }
            int curr = Math.min(left, right);
            prev2 = prev;
            prev = curr;
        }
        return prev;

        // S.C = O(1)   T.C = O(N)

    }

    public static int tabulation(int index, int[] arr) {
        int[] ar = new int[index + 1];
        Arrays.fill(ar, -1);
        ar[0] = 0;
        for (int i = 1; i < index; i++) {
            int left = ar[i - 1] + Math.abs(arr[i] - arr[i - 1]);
            int right = Integer.MAX_VALUE;
            if (i > 1) {
                right = ar[i - 2] + Math.abs(arr[i] - arr[i - 2]);
            }
            ar[i] = Math.min(left, right);
        }
        return ar[index - 1];


    }

    private static int dp(int index, int[] arr) {

        if(index == 0) return 0;
        int ar[] = new int[arr.length+1];
        Arrays.fill(ar, -1);

       if(ar[index]!=-1) return ar[index];
        int left = dp(index-1,arr)+Math.abs(arr[index]-arr[index-1]);
        int right = Integer.MAX_VALUE;
        if(index > 1)
        {
            right = dp(index-2, arr)+Math.abs(arr[index]-arr[index-2]);
        }

        return ar[index-1] = Math.min(left,right);




    }

    private static int recursion(int index, int[] arr) {
        if(index == 0) return 0;
        int left = recursion(index-1,arr)+Math.abs(arr[index]-arr[index-1]);
        int right = Integer.MAX_VALUE;
        if(index > 1)
        {
            right = recursion(index-2, arr)+Math.abs(arr[index]-arr[index-2]);
        }

        return Math.min(left,right);

    }
}
