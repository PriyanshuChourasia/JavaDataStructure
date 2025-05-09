package linkedlist;

import java.util.Scanner;

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
            head = newNode;
            return;
        }

        Node currentNode = head;

        while (currentNode.next != null){
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
    }

//    delete first and delete last
    /****
     * delete first linked list operation will be done
     * **/

    public void deleteFirst(){
        if(head == null){
            System.out.println("List is empty");
        }

        Node currentNode = head;

        head = currentNode.next;
    }

    public void deleteNode(Integer data){
        if(head == null){
            System.out.println("List is Empty");
            return;
        }

        Node currentNode = head;

        while (currentNode.next != null){
            if(currentNode.data == data){

            }
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

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();


        list.insertIntoList(34);
        list.insertIntoList(36);
        list.insertIntoList(38);
        list.insertIntoList(41);
        list.insertIntoList(45);
        list.insertIntoList(57);

        list.deleteFirst();

//        Scanner sc = new Scanner(System.in);


//        int ans;
//        do {
//            System.out.println("Enter number: ");
//            int num = sc.nextInt();
//
//            System.out.println("Do you want to enter another node data: ");
//            ans = sc.nextInt();
//            list.insertIntoList(num);
//        } while (ans != 0);

        list.printList();
    }
}
