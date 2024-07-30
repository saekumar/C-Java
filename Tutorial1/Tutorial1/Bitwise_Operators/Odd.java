package Tutorial1.Bitwise_Operators;

import java.util.Scanner;

public class Odd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(odd(n));
        sc.close();
    }

    private static boolean odd(int n) {
        return (n&1)==1;
        
    }

    
}