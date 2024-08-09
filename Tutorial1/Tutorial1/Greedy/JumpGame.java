package Tutorial1.Greedy;
import java.util.*;
public class JumpGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        // System.out.println(jumpGame(arr,n));
        System.out.println(JumpGame2(arr,n));
        sc.close();
    }

    private static int JumpGame2(int[] arr, int n) {

    //  int minJumps1 = RecursiveHelper(arr,n,0,0);
     int minJumps2 = OptimalApproach(arr,n);
     


     return minJumps2;
    }

    private static int OptimalApproach(int[] arr, int n) {
        int l =0,r =0,jumps = 0;
        while(r<n-1)
        {
            int farthest = 0;
            for(int i=l;i<=r;i++)
            {
                farthest = Math.max(farthest, i+arr[i]);
            }
            l = r+1;
            r = farthest;
            jumps++;

        }




        return jumps;
      
    }

    private static int RecursiveHelper(int[] arr, int n, int idx, int jumps) {
        if(idx>=n-1) return jumps;
        int min = Integer.MAX_VALUE;
        for(int i=1;i<=idx;i++)
        {
            min =Math.min(min, RecursiveHelper(arr, n, idx+i, jumps+1));
        }
        return min;
      
    }

    public static boolean jumpGame(int[] arr, int n) {
        int maxInd = 0;
        for(int i=0;i<n;i++)
        {
            if(i>maxInd) return false;
            maxInd = Math.max(maxInd, i+arr[i]);
        }
        return true;
    }
}
