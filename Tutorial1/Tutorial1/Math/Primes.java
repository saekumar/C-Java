package Tutorial1.Math;
import java.util.*;
/**
 * Primes
 */
public class Primes {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean arr[]=new boolean[n+1];
        check(n,arr);
        sc.close();
    }
    public static void check(int n,boolean ar[])
    {
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            for (int j = i*2; j <=n ; j+=i) {
                ar[j]=true;
            }
        }
        for (int i = 0; i < ar.length; i++) {
            if(!ar[i])
            {
                System.out.println(i);
            }
        }

    }
}