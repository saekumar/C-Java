package Tutorial1.LinkedList;

public class SLL {
    public class Node
    {
        int value;
        Node next;
       public Node(int value)
       {
          this.value = value;
       }
        public Node(int value,Node next)
       {
           this.value = value;
           this.next = next;
       }

    }
    Node head=null;
    Node tail=null;
    int size;
    public SLL()
    {
        this.size =0;
    }

    public void insertFirst(int val)
    {
        Node node = new Node(val,null);
        
        node.next = head;
        head =node;
        if(tail == null)
        {
            tail = head;
        }


        
    }
    public void insertLast(int val)
    {
       if(tail==null)
		{
			insertFirst(val);
			return;
		}
		Node node = new Node(val);
		tail.next=node;
		tail=node;
		size++;
    }
    public void display()
    {
        Node te= head;
        while(te!=null)
        {
            System.out.print(te.value+" -> ");
            te = te.next;
        }
        System.out.println("END");
    }
    public Node findNode(int val)
    {
        Node te = head;
        while(te!=null)
        {
            if(te.value == val)
            {
                return te;
            }
            te =te.next;
        }


        return null;
    }
    public int findIndex(int val)
    {
        Node te = head;
        int c= 0;
        while(te!=null)
        {
            if(te.value == val)
            {
                return c;
            }
            c++;
            te = te.next;
        }

        return -1;
    }
    public void reverse()
    {
        Node te = head;
        Node prev = null;
        Node nextNode;

        while(te!=null)
        {
            nextNode = te.next;
            te.next=prev;
            prev = te;
            te = nextNode;
        }
        head = prev;
    }

    // Remove the duplicates in sorted LinkedList

    public void removeDuplicates()
    {
        Node te = head;
        while (te.next!=null) {
          if(te.value == te.next.value)
          {
            te.next = te.next.next;

          }
          else{
            te = te.next;
          }
            
        }
        tail =te;
        tail.next = null;
    }
    

    
}
