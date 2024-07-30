package Tutorial1.strings;
import java.util.*;
public class ReverseTheSentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
       System.out.println( reverse(str));
       sc.close();

    }

    private static String  reverse(String str) {
       

       String[] arr = str.split(" ");
       int n = arr.length;
       for(int i=0;i<n/2;i++)
       {
         String temp = arr[i];
         arr[i] = arr[n-1-i];
         arr[n-i-1] = temp;

       }
       String finalStr = "";
       for(int i=0;i<n;i++)
       {
        finalStr+=arr[i]+" ";
       } 

       return finalStr;
    }

    
}
