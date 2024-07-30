package Tutorial1;
import java.util.*;
public class Woj {

    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
    System.out.println( deleteDigit(n));
    }

    static int deleteDigit(int n) {
        String number = Integer.toString(n);
        int maxResult = 0;

        for (int i = 0; i < number.length(); i++) {
            StringBuilder temp = new StringBuilder(number);
            temp.deleteCharAt(i);
            int currentNumber = Integer.parseInt(temp.toString());
            maxResult = Math.max(maxResult, currentNumber);
        }

        return maxResult;
    }
}
