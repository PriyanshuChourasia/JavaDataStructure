package exercises;

public class AddTwoNumbers {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    void insert_values(int data){
        Node newNode = new Node(data);
        newNode.next = this.head;
        this.head = newNode;
    }

    void printList(){
        if(this.head == null){
            System.out.println("List is empty");
            return;
        }

        Node temp = this.head;
        while(temp != null){
            System.out.print(temp.data+"-->");
            temp = temp.next;
        }

        System.out.println("End list");
    }

    public static void main(String[] args){
        AddTwoNumbers num1 = new AddTwoNumbers();
        AddTwoNumbers num2 = new AddTwoNumbers();

        for(int i=0; i<7; i++){
            num1.insert_values(9);
        }

        for(int i=0; i<4; i++){
            num2.insert_values(9);
        }

        num1.printList();
        num2.printList();
    }
}
