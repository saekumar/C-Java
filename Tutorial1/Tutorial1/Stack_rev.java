package Tutorial1;
import java.util.*;

public class Stack_rev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] temperatures = new int[n];
            for (int i = 0; i < n; i++) {
                temperatures[i] = sc.nextInt();
            }
            
            int[] answer = calculateWarmerDays(temperatures);
            int[] answer2 = calculateWarmerDays2(temperatures);
            
            for (int i = 0; i < n; i++) {
                System.out.print(answer[i] + " ");
               
            }
            System.out.println();
             for (int i = 0; i < n; i++) {
                System.out.print(answer2[i] + " ");
               
            }
            System.out.println();
        }
        sc.close();
    }
    
    public static int[] calculateWarmerDays(int[] temperatures) {
        int n = temperatures.length;
        int[] answer = new int[n];
        Stack<Integer> stack = new Stack<>();
        
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int prevIndex = stack.pop();
                answer[prevIndex] = i - prevIndex;
            }
            stack.push(i);
        }
        
        return answer;
    }
     public static int[] calculateWarmerDays2(int[] a) {
        int n = a.length;
        int[] b = new int[n];
        Stack<Integer> stk = new Stack<>();
        
        b[n-1]=0;
        stk.push(a[n-1]);
        
        for(int i=n-2;i>=0;i--)
        {
        
            while(!stk.isEmpty() && a[i]>stk.peek())
            {
                stk.pop();
            }
            if(!stk.isEmpty())
            {
                b[i]=stk.peek()-a[i];
            }
            else{
                b[i]=0;
            }
            stk.push(i);
            

        }
        
        return b;
    }
}
