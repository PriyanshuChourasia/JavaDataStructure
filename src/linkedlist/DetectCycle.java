package linkedlist;


class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class DetectCycle {

    Node head = null;
    int size = 0;

    public void insertNode(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        size++;
    }

    public void createCycle(){
        Node cycle = head;
        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = head;
        System.out.println(temp.data);
    }

    public Node detect(){
        if(head == null || head.next == null){
            return null;
        }
        Node slow = head;
        Node fast = head;
        boolean hasCycle = false;

        while(fast != null && fast.next != null){
            slow = slow.next;
            System.out.println("Slow: "+slow.data);
            System.out.println("\n");
            fast = fast.next.next;
            System.out.println("Fast: "+fast.data);
            System.out.println("\n");

            if (slow == fast) {
                System.out.println("Caught");
                System.out.println(slow.data);
                System.out.println("Slow: "+slow.data);
                System.out.println(fast.data);
                System.out.println("Fast: "+fast.data);
                hasCycle = true;
                break;
            }
        }

        if(!hasCycle){
            return null;
        }

        slow = head;
        while (slow != head){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }

    public void displayNode(){
        if(head == null){
            System.out.print("List is empty");
            return;
        }

        Node temp = head;

        while (temp != null){
            System.out.print(temp.data+"--->");
            temp = temp.next;
        }
        System.out.print("NULL");
    }


    public static void main(String[] args){
        DetectCycle detectCycle = new DetectCycle();
        detectCycle.insertNode(1);
        detectCycle.insertNode(2);
        detectCycle.insertNode(3);
        detectCycle.insertNode(4);
        detectCycle.insertNode(5);
        detectCycle.insertNode(6);
        detectCycle.insertNode(7);
        detectCycle.insertNode(8);
        detectCycle.insertNode(9);
        detectCycle.insertNode(10);
        detectCycle.insertNode(11);
        detectCycle.insertNode(12);
        detectCycle.insertNode(13);

        detectCycle.createCycle();
        Node val = detectCycle.detect();

        System.out.println(val.data);

//        detectCycle.displayNode();


    }
}
