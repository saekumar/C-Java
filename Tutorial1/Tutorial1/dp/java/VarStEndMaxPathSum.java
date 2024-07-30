package Tutorial1.dp.java;

public class VarStEndMaxPathSum {
    public static void main(String[] args) {
        int arr[][] = {{1,2,3,4},{4,5,6,24},{7,8,9,4},{17,28,39,4}};

        int n = 4;
        int m = 4;

        int max = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = tabulation(n, m, arr);

        for(int j=0;j<m;j++)
        {
            max = Math.max(max, f(n-1, j, arr));
            max2 = Math.max(max2,topDown(n-1, j, arr));


        }
        System.out.println(max);
        System.out.println(max2);
        System.out.println(max3);
       
        
        
    }

    private static int f(int i, int j, int[][] arr) {
        if(i == 0 && j >= 0 && j < arr[0].length) return arr[i][j];
        if(i < 0 || j < 0 || j >= arr[0].length) return Integer.MIN_VALUE;
        int up = f(i-1, j, arr);
        int leftDiag = f(i-1, j-1, arr);
        int rightDiag = f(i-1, j+1, arr);

        if(up!=Integer.MIN_VALUE) up+=arr[i][j];
        if(leftDiag!=Integer.MIN_VALUE) leftDiag+=arr[i][j];
        if(rightDiag!=Integer.MIN_VALUE) rightDiag+=arr[i][j];

        return Math.max(up, Math.max(leftDiag,rightDiag));



        

    }
    public static int topDown(int i,int j,int arr[][])
    {
        int n = arr.length;
        int m = arr[0].length;
       

        
        int dp[][] = new int[n][m];
        for(int k=0;k<n;k++)
        {
            for(int l=0;l<m;l++)
            {
                dp[k][l] = -1;
            }
        }
        return topDownHelper(i, j, arr,dp);

    }

    public static int topDownHelper(int i,int j,int arr[][],int dp[][])
    {
       if(i == 0 && j >= 0 && j < arr[0].length) return arr[i][j];
        if(i < 0 || j < 0 || j >= arr[0].length) return Integer.MIN_VALUE;

        
        int up = f(i-1, j, arr);
        int leftDiag = f(i-1, j-1, arr);
        int rightDiag = f(i-1, j+1, arr);
        if(dp[i][j]!=-1)
        {
            return dp[i][j];
        }
        if(up!=Integer.MIN_VALUE) up+=arr[i][j];
        if(leftDiag!=Integer.MIN_VALUE) leftDiag+=arr[i][j];
        if(rightDiag!=Integer.MIN_VALUE) rightDiag+=arr[i][j];

        return dp[i][j] = Math.max(up, Math.max(leftDiag,rightDiag));

    }
    public static int tabulation(int n,int m,int arr[][])
    {

        int dp[][] = new int[n][m];

        for(int j=0;j<m;j++)
        {
            dp[n-1][j] = arr[n-1][j];
        }

        for(int i=n-2;i>=0;i--)
        {
            for(int j=0;j<m;j++)
            {
            int up = dp[i+1][j];
            int leftDiag = (j > 0) ? dp[i+1][j-1] : Integer.MIN_VALUE;
            int rightDiag = (j < m - 1) ? dp[i+1][j+1] : Integer.MIN_VALUE;
            dp[i][j] = arr[i][j] + Math.max(up, Math.max(leftDiag, rightDiag));
            }
        }
        int max = Integer.MIN_VALUE;
        for(int j=0;j<m;j++)
        {
            max = Math.max(max,dp[0][j]);

        }
        return max;



       

    }
    
}
