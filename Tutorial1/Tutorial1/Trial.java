package Tutorial1;

public class Trial {
    public static void main(String[] args) {
        int m=2,n=4,tota=0;
        for(;m<10;++m)
        {
            ++n;
            tota+=n;
        }
        System.out.println(n+" "+m);
        System.out.println(tota);
    }
    
}
