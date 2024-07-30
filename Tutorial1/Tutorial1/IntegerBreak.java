package Tutorial1;

import java.util.Scanner;

// https://leetcode.com/problems/integer-break/
public class IntegerBreak {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(integerbreak(n));
        sc.close();
    }

    public static int integerbreak(int n) {

        int k=n,c=0;
        while(k>0)
        {
            c++;
            k/=10;
        }
    //   System.out.println(c);

    

        return 1;
    }
}
