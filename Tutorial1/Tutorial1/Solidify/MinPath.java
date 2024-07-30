package Tutorial1.Solidify;
import java.util.*;
public class MinPath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r=2,c=3;
        int ar[][] = new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                ar[i][j]=sc.nextInt();
            }
        }

        maxPath(ar,r,c);
        // // fill 0 th row
        // for(int j=1;j<c;j++)
        // {
        //     ar[0][j]+=ar[0][j-1];
        // }
        //  // fill 0 th column
        // for(int i=1;i<r;i++)
        // {
        //     ar[i][0]+=ar[i-1][0];
        // }
        // for(int i=1;i<r;i++)
        // {
        //     for(int j=1;j<c;j++)
        //     {
        //         ar[i][j]=Math.min(ar[i-1][j],ar[i][j-1])+ar[i][j];
        //     }
        // }

        

        // for(int i=0;i<r;i++)
        // {
        //     for(int j=0;j<c;j++)
        //     {
        //         System.out.print(ar[i][j]+" ");
        //     }
        //     System.out.println();
        // }
         
        sc.close();
        
    }

    private static void maxPath(int[][] ar, int r, int c) {

        // fill 0 th column
        for(int i=1;i<r;i++)
        {
            
                ar[i][0]+=Math.max(ar[i-1][0],ar[i-1][1]);
            
        }
        // fill remaining all

         for(int i=1;i<r;i++)
        {
            for(int j=1;j<c;j++)
            {
                ar[i][j]+=Math.max(Math.max(ar[i-1][j],ar[i-1][j-1]),(j==c-1?Integer.MIN_VALUE:ar[i-1][j+1]));
            }
        }

        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.println();
                System.out.print(ar[i][j]+" ");
            }
            System.out.println();
        }

        
    }

}
