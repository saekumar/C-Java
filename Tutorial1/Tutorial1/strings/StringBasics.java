package Tutorial1.strings;
import java.util.*;
public class StringBasics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       String s = "Hello World";
         System.out.println(s.indexOf('o'));
         sc.close();
        String s1 = "Hello";
        String s2 = "Izxxxx";
        System.out.println("comparing"+" "+s2.compareTo(s1) );  
        System.out.println("contains"+" "+s1.contains("llo"));
        System.out.println("concat"+" "+s1.concat(" World"));
         substrings(s1);
    }

    private static void substrings(String s1) {
       
        for(int i=0;i<s1.length();i++)
        {
            for(int j=i;j<s1.length();j++)
            {
                System.out.println(s1.substring(i, j+1));
            }
        }
    }
    
}
