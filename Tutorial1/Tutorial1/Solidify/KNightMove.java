package Tutorial1.Solidify;
import java.util.*;
public class KNightMove {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r=sc.nextInt();
        int c = sc.nextInt();
        int ar[][] = new int[r][c];
        
         for(int i=0;i<r;i++)
         {
            for(int j=0;j<c;j++)
            {
                ar[i][j]=0;
            }
         }  
       ar[0][0]=1;
       int cou=0;
       for(int i=1;i<r;i++)
         {
            for(int j=1;j<c;j++)
            {
                int c1=0,c2=0;
               if(i-2>=0 && j-1>=0) 
               {
                c2=ar[i-2][j-1];
                
               }
               if(i-1>=0 && j-2>=0) 
               {
                c2=ar[i-1][j-2];
                
               }
               ar[i][j]=c1+c2;
            }
         } 
         System.out.println(ar[r-1][c-1]);

        
        sc.close();
    }
    
}
