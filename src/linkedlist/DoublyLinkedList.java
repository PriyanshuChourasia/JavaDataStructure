package linkedlist;

public class DoublyLinkedList {
    class Node{
        Node prev;
        int data;
        Node next;

        Node(int data){
            this.prev = null;
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;
    Node tail = null;


    /***
     *  The below function mentions the push front functionality of linked list here we are adding node on the front of the Linked list
     */
    public void insertAtFirstData(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }


    /***
     * The below function is going to add a node from backward of the Linked list
     * **/

    public void insertAtLastNode(int data){
        Node newNode = new Node(data);

        if(head == null){
            tail = newNode;
            head = newNode;
            return;
        }

        newNode.prev = tail;
        tail.next = newNode;
        tail = newNode;
    }

    public void printDoubleNode(){
        if(head == null){
            System.out.println("No list to print");
            return;
        }
        Node currentNode = head;

        while(currentNode != null){
            System.out.print(currentNode.data + " <=> ");
            currentNode = currentNode.next;
        }
        System.out.println("Null");
    }

    public void printReverseList(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }

        Node currentNode = tail;

        while(currentNode != null){
            System.out.print(currentNode.data+" <=> ");
            currentNode = currentNode.prev;
        }
        System.out.println("Null");
    }

    public static void main(String[] args){
        System.out.println("Doubly Linked List : ");
        DoublyLinkedList dblist = new DoublyLinkedList();
        dblist.insertAtFirstData(1);
        dblist.insertAtLastNode(3);
        dblist.insertAtLastNode(5);


        dblist.printDoubleNode();
        dblist.printReverseList();
    }
}
