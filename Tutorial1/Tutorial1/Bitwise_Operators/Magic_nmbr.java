package Tutorial1.Bitwise_Operators;

public class Magic_nmbr {
    public static void main(String[] args) {
        int n=6;
        int sum=0;
        int base=5;
        int ans=(int)(Math.log(n)/Math.log(base))+1;
        int c=1;
        while(n>0)
        {
            int last=(n&1);
            n=n >>1;
            sum+=last*(Math.pow(base, c));
            c++;

        }
        System.out.println(sum+" "+(c-1)+" "+ans);
    } 
}
