package linkedlist;

public class CircularLinkedList {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    Node head;
    Node tail;
    void insert_at_first(int data){
        Node newNode = new Node(data);
        if(this.head == null){
            this.head = newNode;
            this.tail = newNode;
            return;
        }else {
            newNode.next = this.head;
            this.head = newNode;
            this.tail.next = newNode;
        }
    }

    void printList(){
        if(this.head == null){
            System.out.println("List is empty");
            return;
        }

        System.out.print(this.head.data + "-->");
        Node temp = this.head.next;

        while (temp != this.head){
            System.out.print(temp.data+"-->");
            temp = temp.next;
        }

        System.out.println(temp.data+"-->");
    }

    public static void main(String[] args){
        CircularLinkedList cl = new CircularLinkedList();

        cl.insert_at_first(34);
        cl.insert_at_first(35);
        cl.insert_at_first(38);
        cl.insert_at_first(41);
        cl.insert_at_first(49);

        cl.printList();
    }
}
