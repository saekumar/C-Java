package Tutorial1;

import java.util.*;

public class Red_Bblue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int a=sc.nextInt();
        int b=sc.nextInt();
        Queue<Integer> que=new LinkedList<>();
        if(a>b)
        {
            System.out.println(a-b);
        }
        else if(a==b)
        {
            System.out.println(0);
        }
        else
        {
            que.add(a);
            int c=0;
            while(true)
            {
                int k=que.remove();
                c++; 
                if(k==b)
                {
                    System.out.println(c-1);
                    break;
                }
                else{
                    if(b>(k-1))
                    {
                       que.add(2*k);

                    }
                    else{
                        que.add(k-1);
                    }
                }
            }
        }
        sc.close();
    }
}
