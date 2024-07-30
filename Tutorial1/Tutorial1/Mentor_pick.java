package Tutorial1;

import java.util.*;

public class Mentor_pick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); 
        scanner.nextLine(); 
        
        for (int t = 0; t < T; t++) {
            int N = scanner.nextInt(); 
            scanner.nextLine();
            
            Stack<Integer> stack = new Stack<>();
            
            for (int i = 0; i < N; i++) {
                String operation = scanner.nextLine();
                
                if (operation.equals("+")) {
                    int prev1 = stack.pop();
                    int prev2 = stack.peek();
                    stack.push(prev1);
                    stack.push(prev1 + prev2);
                } else if (operation.equals("D")) {
                    int prev = stack.peek();
                    stack.push(prev * 2);
                } else if (operation.equals("C")) {
                    stack.pop();
                } else {
                    int score = Integer.parseInt(operation);
                    stack.push(score);
                    
                }
            }
            
            int sum = 0;
            for (int score : stack) {
                sum += score;
            }
            
            System.out.println(sum);
        }
        
        scanner.close();
    }
}

