package Tutorial1.Greedy;
import java.util.*;
public class AssignCookies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int arr[] = new int[n];
        int brr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();

        }
        for(int i=0;i<n;i++)
        {
            brr[i] = sc.nextInt();

        }
        System.out.println(check(arr,brr,n));
        sc.close();
    }

    public static int check(int[] arr, int[] brr, int n) {
        Arrays.sort(arr);
        Arrays.sort(brr);
        int st1 = 0,st2 =0,c = 0;
        while(st1<n && st2<n)
        {
            if(arr[st1]<=brr[st2])
            {
                st1++;
                st2++;
                c++;
            }
            else{
                st2++;
            }
        }
        return c;
        
    }
}
