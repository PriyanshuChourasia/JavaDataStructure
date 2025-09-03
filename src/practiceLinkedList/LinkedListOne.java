package practiceLinkedList;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}


public class LinkedListOne {

    Node head = null;

    void insert_at_head(int val){
        Node newnode = new Node(val);
        newnode.next = head;
        head = newnode;
    }

    void display_list(){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.data+"---->");
            temp = temp.next;
        }

        System.out.println("Null");
    }


    public static void main(String[] args){
        LinkedListOne linkedListOne = new LinkedListOne();

        linkedListOne.insert_at_head(45);
        linkedListOne.insert_at_head(56);
        linkedListOne.insert_at_head(12);

        linkedListOne.display_list();
    }
}
