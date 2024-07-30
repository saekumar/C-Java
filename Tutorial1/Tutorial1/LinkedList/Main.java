package Tutorial1.LinkedList;

import Tutorial1.LinkedList.SLL.Node;

public class Main {


   public static SLL merge(SLL fi,SLL sec)
   {
    Node head1 = fi.head;
    Node head2 = sec.head;
    SLL temp = new SLL();

    while(head1!=null && head2!=null)
    {
        if(head1.value<=head2.value)
        {
           temp.insertLast(head1.value);
           head1 = head1.next;

           

        }
        else{
            temp.insertLast(head2.value);
            head2 = head2.next;
            
        }


    }

    while(head1!=null)
    {
        temp.insertLast(head1.value);
        head1 = head1.next;

    }
    while (head2!=null) {
        temp.insertLast(head2.value);
        head2 = head2.next;
        
    }
    return temp;



   }

    public static void main(String[] args) {
        // SLL list = new SLL();
        // list.insertFirst(4);
        // list.insertFirst(3);
        // list.insertFirst(2);
        // list.insertFirst(2);
        // list.insertFirst(1);
        // list.insertFirst(1);
        // list.insertFirst(1);
        // list.insertFirst(1);
        // list.insertLast(90);
        // list.display();
        // System.out.println(list.size);
        // list.removeDuplicates();
        // list.display();
        // // System.out.println();
        // // list.findIndex(676);
        // // System.out.println();
        // // list.findNode(787);
        // // System.out.println();
        // // list.reverse();
        // // list.display();


        SLL list1 = new SLL();
        SLL list2 = new SLL();
        SLL list3 = new SLL();

        list1.insertFirst(5);
        list1.insertFirst(3);
        list1.insertFirst(2);
        list1.insertFirst(1);


        list2.insertFirst(5);
        list2.insertFirst(4);
        list2.insertFirst(3);
        list2.insertFirst(1);

        list3.insertLast(5);
        list3.insertLast(4);
        list3.insertLast(3);
        list3.insertLast(1);
        

        


        SLL ans = merge(list1, list2);
        ans.display();
    }



    
}
