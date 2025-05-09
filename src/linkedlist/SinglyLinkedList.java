package linkedlist;

public class SinglyLinkedList {

//    Created a class node to create a new linked list
    class Node{
        Integer data;
        Node next;

        Node(Integer data){
            this.data = data;
            this.next = null;
        }
    }
    Node head;
//    add first , last

    public void insertAtFirst(Integer data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void insertAtLast(Integer data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }

        Node currentNode = head;

        while(currentNode.next != null){
            currentNode = currentNode.next;
        }

        System.out.println(currentNode.data +" current node");

        currentNode.next = newNode;

    }

    public void insertIntoList(Integer data){
        Node newNode = new Node(data);
        if(head == null){

        }
    }

    public void printList(){

        if(head == null){
            System.out.println("List is Empty");
            return;
        }

        Node currentNode = head;

        while(currentNode != null){
            System.out.print(currentNode.data+" -> ");
            currentNode = currentNode.next;
        }

        System.out.print("Null");
    }

    public static void main(String[] args){
        SinglyLinkedList list = new SinglyLinkedList();
        list.insertAtFirst(23);
        list.insertAtFirst(25);
        list.insertAtLast(26);
        list.insertAtLast(56);

        list.printList();
    }
}
