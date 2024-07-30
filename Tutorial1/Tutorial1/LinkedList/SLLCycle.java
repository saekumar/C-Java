package Tutorial1.LinkedList;

public class SLLCycle {
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
    int size;
    public SLLCycle()
    {
        this.size = 0;
    }
    Node head = null;


    public void insertLast(int data)
    {
        Node newNode = new Node(data,null);
        if(head == null)
        {
            head = newNode;
        }
        Node te = head;
        while(te.next!=null)
        {
            te = te.next;
        }
        te.next = newNode;
        


    }
    
}
