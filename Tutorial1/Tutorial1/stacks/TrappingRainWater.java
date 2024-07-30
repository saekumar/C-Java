package Tutorial1.stacks;
import java.util.*;
public class TrappingRainWater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println(calcTrappedRainWater(n,arr));
        sc.close();
    }

    public static int calcTrappedRainWater(int n, int[] arr) {
        int total = 0;
        int leftMax[] = new int[n];
        int rightMax[] = new int[n];

        leftMax[0] = arr[0];
        for(int i=1;i<n;i++)
        {
            leftMax[i] = Math.max(arr[i],leftMax[i-1]);
        }
        rightMax[n-1] = arr[n-1];
        for(int i=n-2;i>=0;i--)
        {
            rightMax[i] = Math.max(arr[i], rightMax[i+1]);
        }

        for(int i=0;i<n;i++)
        {
            total+=Math.min(leftMax[i], rightMax[i])-arr[i];
        }


        return total;
    }
    
}
