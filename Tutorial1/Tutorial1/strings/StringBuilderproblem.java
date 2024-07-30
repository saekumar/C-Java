package Tutorial1.strings;
import java.util.*;
public class StringBuilderproblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder(s);
        // int n = sc.nextInt();

        // System.out.println(check(n,sb));
        // System.out.println(upperToLower_LowerToUpper(sb));
        // System.out.println(palindromicSubStrings(sb));
        // System.out.println(revEachWord(sb));
        System.out.println(compressString(sb));
        sc.close();
    }

    private static String compressString(StringBuilder sb) {
        String str = "";
        int idx = -1;
        for(int i=0;i<sb.length()-1;i++)
        {
            if(sb.charAt(i)!=sb.charAt(i+1))
            {
                // System.out.println(idx+" "+i);
                idx = i-idx;
                str+=sb.charAt(i);
                str+=idx;
                idx=i;
                

            }
        }
        return str;

    }

    private static String revEachWord(StringBuilder sb) {
        String s = sb.toString();
        String arr[] = s.split(" ");
        String newString = "";
        for(int i=0;i<arr.length;i++)
        {
            StringBuilder str = new StringBuilder(arr[i]);
            newString += str.reverse().toString();
            newString+=" ";

        }
        return newString;
    }

    private static int palindromicSubStrings(StringBuilder sb) {

        int c =0 ;

        for(int i=0;i<sb.length();i++)
        {
            for(int j=i+1;j<=sb.length();j++)
            {
                String str = sb.substring(i, j);
                StringBuilder strRev = new StringBuilder(str).reverse();
                if(strRev.toString().equals(str))
                {
                    System.out.print(str+" ");
                    c++;
                }
            }
        }
       return c;
    }

    private static String upperToLower_LowerToUpper(StringBuilder sb) {

        for(int i=0;i<sb.length();i++)
        {
            if(Character.isUpperCase(sb.charAt(i)))
            {
                sb.setCharAt(i, Character.toLowerCase(sb.charAt(i)));
            }
            else{
                sb.setCharAt(i, Character.toUpperCase(sb.charAt(i)));
            }
        }
        String str = sb.toString();
        return str;

 

     
    }

    private static String check(int n, StringBuilder s) {
        if(n==0)
        {
           for(int i=0;i<s.length();i++)
           {
               if(s.charAt(i)==' ')
               {
                 s.setCharAt(i, '_');

               }
           }

        }
        else{
            for(int i=0;i<s.length();i++)
            {
                if(s.charAt(i)==' ')
                {
                  s.setCharAt(i+1, Character.toUpperCase(s.charAt(i+1)));
                  s.deleteCharAt(i);
                }
            }

        }
         String str = s.toString();
         return str;
 
    }
}
