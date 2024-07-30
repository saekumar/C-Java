package Tutorial1.BFS;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.*;

class Entry
{
    int n,val;
    public Entry(int n,int val)
    {
        this.n = n;
        this.val = val;
    }

}
public class MInsteps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
      check(n);
    }

    private static void check(int n) {
            Queue<Entry> q = new LinkedList<>();
            HashMap<Entry,Entry> hash = new HashMap<>();
            Stack<Integer> stk = new Stack<>();
            q.add(new Entry(n, 0));
            hash.put(new Entry(n, 0),null);
            while(!q.isEmpty())
            {
                Entry fir = q.remove();
                if(fir.n == 1)
                {
                    Entry curr = fir;
                    while(curr!=null)
                    {
                        System.out.println(curr.n+" ");
                        stk.push(curr.n);
                        curr = hash.get(curr);
                    }
                    while(!stk.isEmpty())
                    {
                        System.out.print(stk.pop()+" ");
                    }
                    break;
                 
                }
                if(fir.n%3==0)
                {
                 
                    Entry child = new Entry(fir.n/3,fir.val+1);
                    q.add(child);
                    hash.put(child,fir);
                }
                if(fir.n%2==0)
                {
                 
                   Entry child = new Entry(fir.n/2,fir.val+1);
                    q.add(child);
                    hash.put(child,fir);
                    
                }
                    Entry child = new Entry(fir.n-1,fir.val+1);
                    q.add(child);
                    hash.put(child,fir);

            }
            
           
            
    }
}
