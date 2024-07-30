package Tutorial1.stacks;

import java.util.*;

class Sta {
    int val, min;

    Sta(int val, int min) {
        this.val = val;
        this.min = min;
    }

    @Override
    public String toString() {
        return "Value: " + val + ", Min: " + min;
    }
}

public class MiStack {
    static Stack<Sta> stk = new Stack<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Stack<Sta> stack = buildStack(arr);
        for (Sta item : stack) {
            System.out.println(item);
        }
        System.out.println("Minimum: " + getMin());
        sc.close();
    }

    public static Stack<Sta> buildStack(int[] arr) {
        int min = arr[0];
        Sta item = new Sta(arr[0], arr[0]);
        stk.push(item);
        for (int i = 1; i < arr.length; i++) {
            min = Math.min(min, arr[i]);
            stk.push(new Sta(arr[i], min));
        }
        return stk;
    }

    public static int getMin() {
        return stk.peek().min;
    }
}
