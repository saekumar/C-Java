package Tutorial1.dp.java;

import java.util.Scanner;

public class SubsetSum {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n= sc.nextInt();
        int wallet[] = new int[n];
        for(int i=0;i<n;i++)
        {
            wallet[i]= sc.nextInt();
        }
        int q= sc.nextInt();
        int queries[] = new int[q];
        int mx =0;
        for(int i=0;i<n;i++)
        {
            queries[i]= sc.nextInt();
            mx = Math.max(mx,queries[i]);
        }
        
        boolean dp[][] = new boolean[n+1][mx+1];
        dp[0][0] = true;
        for(int i=1;i<=n;i++)
        {
            for(int j=0;j<=mx;j++)
            {
                if(dp[i-1][j])
                {
                    dp[i][j]=true;
                }
                else{
                    int coin=wallet[i-1];
                    if(coin<=j)
                    {
                        dp[i][j]=dp[i-1][j-coin];
                    }
                }
            }
        }

        for(int i=0;i<q;i++)
        {
            if(dp[n][queries[i]])
            {
                System.out.println("Yes ");
            }
            else{
                System.out.println("No");
            }
        }


        
    }
}
