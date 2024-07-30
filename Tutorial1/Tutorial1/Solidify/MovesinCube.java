package Tutorial1.Solidify;
import java.util.*;
public class MovesinCube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        
        System.out.println(check(r));
        sc.close();
    }

    public static int check(int r) {
        if(r<2)
        
        {
            return -1;
        }
        if(r==2)
        {
            return 2;
        }
        else{
            return 2+(r-1)*check(r-1);
        }





       
    }
    
}
