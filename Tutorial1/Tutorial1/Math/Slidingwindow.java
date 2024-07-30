package Tutorial1.Math;
import java.util.*;
public class Slidingwindow {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int k = sc.nextInt();
        long arr[] = new long[n];
        for(int i=0;i<n;i++)
        {
             arr[i]=sc.nextLong();
        } 
        System.out.println(check(arr,n,k));
    }

    private static long check(long[] arr, int n, int k) {

        long sum =0;
        for(int i=0;i<k;i++)
        {
            sum+=arr[i];
        }
        int st =1,end=k;
        while(end<n)
        {
            long sum2 = sum+arr[end]-arr[st-1];
            sum=Math.max(sum2,sum);
            st++;
            end++;
            
        }


        return sum;
    }
    
}
