package Tutorial1.dp.java;
import java.util.*;
public class TriangleMinPathSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int arr[][] = {
            {1},
            {4,5},
            {7,1,3},
            {8,3,4,6}
        };
        
        System.out.println(recursion(arr,0,0));
        System.out.println(topDown(arr,0,0));
        System.out.println(tabulation(arr));
    }

    public static int recursion(int[][] arr, int i, int j) {
        
        
        if(i==arr.length-1) return arr[arr.length-1][j];
        if(i>arr.length-1 || j>arr[i].length-1) return Integer.MAX_VALUE;


        int down = recursion(arr, i+1, j);
        int diagonal = recursion(arr, i+1, j+1);

        if(down!=Integer.MAX_VALUE) down+=arr[i][j];
        if(diagonal!=Integer.MAX_VALUE)diagonal+=arr[i][j];

        return Math.min(down,diagonal);

        
    }
    public static int topDown(int arr[][],int i,int j)
    {
        if(i==arr.length-1) return arr[arr.length-1][j];
        if(i>arr.length-1 || j>arr[i].length-1) return Integer.MAX_VALUE;
        int n = arr.length;
        int m = arr[arr.length-1].length;
        int dp[][] = new int[n][m];
        for(int k=0;k<n;k++)
        {
            for(int h=0;h<m;h++)
            {
                dp[k][h] = -1;
            }
        }
        if(dp[i][j]!=-1)
        {
            return dp[i][j];
        }

        int down = recursion(arr, i+1, j);
        int diagonal = recursion(arr, i+1, j+1);

        if(down!=Integer.MAX_VALUE) down+=arr[i][j];
        if(diagonal!=Integer.MAX_VALUE)diagonal+=arr[i][j];

        return dp[i][j]=Math.min(down,diagonal);
    }
    public static int tabulation(int arr[][])
    {
        
        
        int n = arr.length;
        int m = arr[arr.length-1].length;
        int dp[][] = new int[n][m];
        dp[0][0] = arr[0][0];
        for(int i=1;i<n;i++)
        {
           dp[i][0] = dp[i-1][0]+arr[i][0];
        }
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < arr[i].length; j++) {
                if (j < arr[i - 1].length) {
                    dp[i][j] = Math.min(dp[i - 1][j - 1], dp[i - 1][j]) + arr[i][j];
                } else {
                    dp[i][j] = dp[i - 1][j - 1] + arr[i][j];
                }
            }
        }
        int min = Integer.MAX_VALUE;
        for(int i=0;i<m;i++)
        {
            if(dp[n-1][i]<min)
            {
                min = dp[n-1][i];
            }
        }
        return min;
        
    }
    
}
