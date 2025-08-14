package practiceLink;

import java.util.Scanner;

class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next  = null;
    }
}

public class LinkedList {

    Node head = null;

    public void insertAtHead(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void displayList(){
        if(head == null){
            System.out.println("The list is empty");
            return;
        }

        Node temp = head;

        while (temp!= null){
            System.out.print(temp.data + "--->");
            temp = temp.next;
        }

        System.out.print("Null");
    }

    public static void main(String[] args){
        LinkedList linkedList = new LinkedList();

        Scanner sc = new Scanner(System.in);

        int ans = 0;

        do {
            System.out.print("Enter your data: ");
            int data = sc.nextInt();
            linkedList.insertAtHead(data);

            System.out.print("Do you want to enter again 1. Yes , 0. No");
            ans = sc.nextInt();
        }while(ans !=0);

        linkedList.displayList();

    }
}
