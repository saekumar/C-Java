package Tutorial1;
import java.util.*;
public class Pair {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        Queue<Pair2> q =new LinkedList<>();
        Set<Integer> s=new HashSet<>();
        q.add(new Pair2(n, 0));
        s.add(n);
        int ans=0;
        while(true)
        {
            Pair2 x=q.remove();
            if(x.value==m)
            {
                ans=x.level;
                break;
            }
            if(x.value<m && !s.contains(x.value*2))
            {
                s.add(x.value*2);
                q.add(new Pair2(x.value*2, x.level+1));
            }
            if(!s.contains(x.value-1))
            {
                s.add(x.value-1);
                q.add(new Pair2(x.value-1, x.level+1));
            }
        }
        System.out.println(ans);
        sc.close();
        
    }
    
}
class Pair2{
    int value,level;
    public Pair2(int v,int l)
    {
        value=v;
        level=l;
    }
}
