package Tutorial1.LinkedList;

/**
 * CDLL
 */
class CDLLNode
{
    int key,val;
    CDLLNode prev;
    CDLLNode next;
    public CDLLNode(int key,int val)
    {
        this.key=key;
        this.val= val;
    }
}
public class CDLL {

    static CDLLNode head = null;
    static CDLLNode insertBegin(int key,int val)
    {
        CDLLNode cn = new CDLLNode(key,val);
        cn.next= cn;
        cn.prev = cn;
        if(head == null)
        {
            head = cn;
        }
        else{
            CDLLNode te = head;
            cn.prev = te.prev;
            cn.next = te;
            te.prev.next = cn;
            te.prev = cn;
            head = cn;
        }
        return head;

    }
    static int delLast()
    {
        if(head == null) return -1;
        if(head.next==head.prev) head = null;
        CDLLNode te1 = head;
        CDLLNode te2 = head.prev.prev;
        te1.prev = te2;
        te2.next = te1;

        return head.prev.key;
        

    }
    static void printEles()
    {
        CDLLNode te = head;
        CDLLNode last = head.prev;
        boolean check = true;
        while(check)
        {
            System.out.println(te.key+" "+te.val);
            if(te==last)
            {
                check = false;

            }
            te = te.next;
        }
    }
    static void moveFront(int posi)
    {
        CDLLNode te1 = head;
        for(int i=0;i<posi-1;i++)
        {
            te1 = te1.next;
        }
        CDLLNode te2 = te1.prev;
        te2.next = te1.next;
        te1.next.prev = te2;
        te1.prev = head.prev;
        te1.next = head;
        head.prev = te1;
        head = te1;


    }
    
    public static void main(String[] args) {

        CDLLNode cl = new CDLLNode(1, 100);
        insertBegin(12,35);
        insertBegin(13, 36);
        insertBegin(18,35);
        insertBegin(19, 36);
        insertBegin(20,35);
        insertBegin(133, 36);
        insertBegin(199, 36);
        insertBegin(200,35);
        insertBegin(1333, 36);
        printEles();
        delLast();
        System.out.println();
        printEles();
        moveFront(3);
        System.out.println();
        System.out.println();
        printEles();

        
    }

    
}