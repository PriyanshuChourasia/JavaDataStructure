package linkedlist;



public class LinearSearch {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    Node head;


    public void insert_at_first(int data){
        Node newNode = new Node(data);
        newNode.next = this.head;
        this.head = newNode;
    }


    public void search_target(int data){
        if(this.head == null){
            System.out.println("List is empty");
            return;
        }

        Node currentNode = this.head;
        boolean found = false;

        while(currentNode.next != null){
            if(currentNode.data == data){
                found = true;
                break;
            }
            currentNode = currentNode.next;
        }

        if(found){
            System.out.println("Data is found");
        }else{
            System.out.println("Data is not found");
        }
    }


    public void printList(){
        if(this.head == null){
            System.out.println("List is empty");
            return;
        }

        Node currentNode = this.head;

        while (currentNode != null){
            System.out.println(currentNode.data + "----->");
            currentNode = currentNode.next;
        }
    }

    public static void main(String[] args){
        LinearSearch ls = new LinearSearch();

        for(int i=0; i<12; i++){
            ls.insert_at_first(i);
        }
        ls.printList();
        ls.search_target(15);
    }
}
