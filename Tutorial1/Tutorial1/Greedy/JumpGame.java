package Tutorial1.Greedy;
import java.util.*;
public class JumpGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println(jumpGame(arr,n));
        sc.close();
    }

    public static boolean jumpGame(int[] arr, int n) {
        int maxInd = 0;
        for(int i=0;i<n;i++)
        {
            if(i>maxInd) return false;
            maxInd = Math.max(maxInd, i+arr[i]);
        }
        return true;
    }
}
