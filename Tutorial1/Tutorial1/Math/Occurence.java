package Tutorial1.Math;

import java.util.*;

public class Occurence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        int arr[] = {1,1,1,1,2,2,2,3,3,3,4,4,4,4};
        int c =0;
        HashMap<Integer,Integer> hash = new HashMap<>();
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]!=arr[i+1])
            {
                
                System.out.println(arr[i]+" "+((i+1)-c));
                c= i+1;
            }
            


        }
        System.out.println(arr[arr.length-1]+" "+(arr.length-c));

        for(int i=0;i<arr.length;i++)
        {
            hash.put(arr[i],hash.getOrDefault(arr[i], 0)+1);
        }
        System.out.println("HashMap  ");
        for(int x:hash.keySet())
        {
            System.out.println(x+" "+hash.get(x));
        }



        sc.close();
    }
}
