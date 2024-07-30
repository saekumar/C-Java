package Tutorial1.Math;
import java.util.*;
public class StringModifier {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String s = "hello world hi there how are you";
        int n = sc.nextInt();

        System.out.println(check(s,n));
    }
    public static String check(String s,int n)
    {
        if(n==0)
        {
           String arr[] = s.split(" ");
           String newString = "";
           newString+=arr[0];
              for (int i = 1; i < arr.length; i++) {
                newString+=arr[i].substring(0,1).toUpperCase()+arr[i].substring(1);
              }
              return newString;
        }
        else{
            String arr[] = s.split(" ");
            String newString = "";
            newString+=arr[0];
            for (int i = 1; i < arr.length; i++) {
                newString+="_";
                newString+=arr[i];
            }
            return newString;

        }
        
    }
}
