package Tutorial1.dp.java;
import java.util.*;
public class MinPathSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[][] = new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println( recursion(arr,n-1,m-1));
        // System.out.println(topDown(arr,n-1,m-1));
        System.out.println(tabulation(arr, n, m));
        
    }
    public static int tabulation(int arr[][],int n,int m)
    {
        int dp[][] = new int[n][m];
        dp[0][0] = arr[0][0];
        for(int i=1;i<n;i++)
        {
            int sum = arr[0][i];
            dp[0][i]=dp[0][i-1]+sum;
        }
        for(int i=1;i<m;i++)
        {
            int sum = arr[i][0];
            dp[i][0]=dp[i-1][0]+sum;
        }
        
        for(int i=1;i<n;i++)
        {
            for(int j=1;j<m;j++)
            {
                dp[i][j] = arr[i][j]+Math.min(dp[i-1][j],dp[i][j-1]);
            }
        }
        
        return dp[n-1][m-1];

       

    }

    public static int topDown(int[][] arr, int n, int m) {
        if(n==0 && m==0)
        {
            return arr[0][0];
        }
        if(n<0 || m<0)
        {
            return Integer.MAX_VALUE;
        }


        
        int dp[][] = new int[n+1][m+1];
        for(int i=0;i<n+1;i++)
        {
            for(int j=0;j<m+1;j++)
            {
                dp[i][j] = -1;
            }
        }
        if(dp[n][m]!=-1)
        {
            return dp[n][m];

        }
        int up = arr[n][m]+topDown(arr, n-1, m);
        int left = arr[n][m]+topDown(arr, n, m-1);
         return dp[n][m] = Math.min(up,left);




        
   
    }

    public static int recursion(int[][] arr, int i, int j) {
        if(i==0 && j==0)
        {
            return arr[i][j];
        }
        if(i<0 || j<0)
        {
            return Integer.MAX_VALUE;
        }
        int up = recursion(arr, i-1, j);
        int left = recursion(arr, i, j-1);
        if(up!=Integer.MAX_VALUE) up+=arr[i][j];
        if(left!=Integer.MAX_VALUE) left+=arr[i][j];
        return Math.min(up, left);
        


        
    
    }
    
}
