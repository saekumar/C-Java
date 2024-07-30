package Tutorial1.stacks;

import java.util.*;

public class NextGreateElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }

        nextGreterEle(arr);
    }

    private static void nextGreterEle(int[] arr) {
        Stack<Integer> stk = new Stack<>();
        int ar[] = new int[arr.length];
        Arrays.fill(ar, -1);
        ar[ar.length-1] = arr[ar.length-1];
        stk.push(arr[ar.length-1]);
        for(int i=ar.length-2;i>=0;i--)
        {
            if(arr[i]>stk.peek())
            {
                while(!stk.isEmpty() && stk.peek()<arr[i])
                {
                    stk.pop();
                }
                if(!stk.isEmpty())
                {
                    ar[i] = stk.peek();
                    
                }
                else{
                    ar[i] = arr[i];
                    
                }
                stk.push(arr[i]);

            }
            else{

                ar[i] = stk.peek();
                stk.push(arr[i]);

            }


        }
        for(int x:ar)
        {
            System.out.print(x+" ");
        }

    }
}
