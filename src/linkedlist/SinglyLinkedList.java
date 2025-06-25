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

    /***
     * delete the first node of linked list
     * */
    public void deleteFirst(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }

        Node currentNode = head;

        head = currentNode.next;
    }

    /*****
     * delete the last node of linked list
     * ****/

    public void deleteLast(){
        if(head == null){
            System.out.println("List is Empty");
            return;
        }

        if(head.next == null){
            head = null;
            return;
        }

        Node currentNode = head.next;
        Node prevNode = head;

        while(currentNode.next != null){
            prevNode = currentNode;
            currentNode = currentNode.next;
        }

        prevNode.next = null;

    }

    public void deleteNode(int data){
        if(head == null){
            System.out.println("List is Empty");
            return;
        }

        if(head.data == data){
            Node currenNode = head;
            head = currenNode.next;
            return;
        }

        Node currentNode = head.next;
        Node prevNode = head;

        while (currentNode.next != null){
            if(currentNode.data == data){
                prevNode.next = currentNode.next;
                return;
            }
            prevNode = currentNode;
            currentNode = currentNode.next;
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

        list.deleteNode(38);

        list.deleteLast();
    
        list.deleteFirst();

        Scanner sc = new Scanner(System.in);


        int ans;
        do {
            System.out.println("Enter number: ");
            int num = sc.nextInt();

            System.out.println("Do you want to enter another node data: ");
            ans = sc.nextInt();
            list.insertIntoList(num);
        } while (ans != 0);

        list.printList();
    }
}
