package Tutorial1.dp.java;
import java.util.*;
public class Fibonacci {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       System.out.println(f1(n));
       System.out.println(f2(n));
       System.out.println(f3(n));
       sc.close(); 
    }

    private static int f3(int n) {
         
    // Time Cmplexity : O(n);
   // Space Complexity : O(1)

      int prev1 = 0;
      int prev2 = 1;
      for(int i=2;i<=n;i++)
      {
         int curr = prev1 + prev2;
         prev1 = prev2;
         prev2 = curr;

      }
      return prev2;
   }

   private static int f2(int n) {
      // Time Cmplexity : O(n);
      // Space Complexity : O(n)
        int dp[] = new int[n+1];
      
      dp[0] = 0;
      dp[1] = 1;
        for(int i=2;i<=n;i++)
        {
         dp[i] = dp[i-1]+dp[i-2];
        }
        return dp[n];
   }

   private static int f1(int n) {
      // Time Cmplexity : O(n);
         // Space Complexity : O(n)
     int dp[] = new int[n+1];
     Arrays.fill(dp,-1);
     if(n<=1)
     {
        return n;
     }
     return dp[n] = f1(n-1)+f1(n-2);

    }
}
