package Tutorial1.LinkedList;

import java.util.Scanner;

public class HappyNumber {


    public class Node{
        int data;
        Node next;
        public Node(int data)
        {
            this.data = data;
        }
        public Node(int data,Node next)
        {
            this.data = data;
            this.next = next;
        }
    }
    Node head= null;

    public void insertLast(int data)
    {
        Node node = new Node(data,null);
        if(head == null)
        {
            head = node;
        }
        else{
            node.next = head;
            head = node;
        }


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();

        
       
        System.out.println(happy(n));
    }

    public static boolean happy(int n) {

        int slow = sqr(n);
        int fast = sqr(n);

        do {
            slow = sqr(slow);
            fast = sqr(sqr(fast));
        } while (slow!=fast);
        
      if(slow == 1)
      {
        return true;

      }
      return false;

    }
    public static int sqr(int n) {

       int sum =0;
        while(n>0)
        {
         int rem= n%10;
         sum+=Math.pow(rem, 2);
         n/=10;
         
        }
        return sum;
    }
}
