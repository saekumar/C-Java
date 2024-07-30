package Tutorial1.LinkedList;

public class DLL {

    private class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data)
        {
            this.data = data;

        }
        public Node(int data,Node next,Node prev)
        {
            this.data =data;
            this.next = next;
            this.prev = prev;
        }

    }
    Node head = null;
    Node tail = null;
    int size;
    public DLL()
    {
        this.size = 0;
    }

    public void insertFirst(int data)
    {
       Node node = new Node(data,null,null);
		if(head == null)
		{
			head = node;
			tail = head;
		}
		else{
            node.next=head;
        head.prev = node;
		node.prev=null;
		head = node;
        }
        size++;


    }
    public void display()
    {
        Node te = head;
        while(te!=null)
        {
            System.out.print(te.data+" -> ");
            te = te.next;
        }
        System.out.println("END");
    }
    public void insertLast(int data)
    {
      Node newNode = new Node(data,null,null);
      if(head == null)
      {
        insertFirst(data);
        return ;
      }

      tail.next = newNode;
      newNode.prev = tail;
      tail = newNode;
      size++;


    }
    
}
