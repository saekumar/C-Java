package Tutorial1.Greedy;
import java.util.*;
public class LemonadeChange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        
        System.out.println(checkLemonade2(arr,n));
        sc.close();
    }

    private static boolean checkLemonade2(int[] arr, int n) {
        int five =0,ten =0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==5)
            {
                five++;
            }
            else if(arr[i]==10)
            {
                ten++;
                if(five>0)
                {
                    five--;
                }
                else{
                    return false;
                }
            }
            else
            {
                if(ten>0 && five>0)
                {
                    ten--;
                    five--;
                }
                else if(five>2){
                    five-=3;

                }
                else
                {
                    return false;
                }
            }
        }
       

        return true;
    }
}
    
