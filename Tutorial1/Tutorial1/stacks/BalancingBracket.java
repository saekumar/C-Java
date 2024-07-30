package Tutorial1.stacks;
import java.util.*;
/**
 * BalancingBracket
 */
public class BalancingBracket {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
       System.out.println( checkBalancinfBracket(s));
    }

    private static boolean checkBalancinfBracket(String s) {
        if(s.length()==0) return true;
        if(s.length()==1 || s.charAt(0)=='}' || s.charAt(0)==']' || s.charAt(0)==')') return false;
     Stack<Character> stk = new Stack<>();
     for(int i=0;i<s.length();i++)
     {
        char ch = s.charAt(i);
        if(ch=='{' || ch=='(' || ch=='[')
        {
            stk.push(ch);
        }
        else{
            if((ch=='}' && stk.peek()=='{') || (ch==']' && stk.peek()=='[') || (ch==')' && stk.peek()=='('))
            {
                stk.pop();
            }
        }
     }
     return stk.isEmpty();
    }
}