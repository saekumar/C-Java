package Tutorial1.Bitwise_Operators;

public class PowerOf_2 {
    public static void main(String[] args) {
        int n=0;
        System.out.println(ans(n));
    }

    private static boolean ans(int n) {
       if(n==0)
       {
        return true;
       }
       return  (n & n-1) ==0;

        
    }
}
