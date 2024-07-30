package Tutorial1.BFS;
import java.util.*;
public class JumpingNmbr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(check(n));
        
    }

    private static void check2(int n) {

    }

    private static boolean check(int n) {
        if(n<=10)
        {
            return true;
        }
        ArrayList<Integer> ar = new ArrayList<>();
        while(n>0)
        {
            int rem = n%10;
            ar.add(rem);
            n/=10;
        }
        for(int i=0;i<ar.size()-2;i++)
        {
            if(Math.abs(ar.get(i)-ar.get(i+1))!=1)
            {
                return false;

            }
        }

        return true;
    }
}
