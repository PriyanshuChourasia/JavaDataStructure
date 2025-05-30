package linkedlist;

public class CircularLinkedListPractice {
    class CircularNode{
        Integer data;
        CircularNode next;

        CircularNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    CircularNode head = null;
    CircularNode tail = null;

    int size = 0;

    boolean isEmpty(){
        return this.size == 0 && this.head == null && this.tail == null;
    }

    void insert_at_head(int data){
        CircularNode newNode = new CircularNode(data);
        if(this.isEmpty()){
            this.head = newNode;
            this.tail = newNode;
            this.head.next = this.tail;
            this.size++;
            return;
        }else{
            newNode.next = this.head;
            this.tail.next = newNode;
            this.head = newNode;
            this.size++;
        }
    }

    void delete_at_head(){
        if(this.isEmpty()){
            System.out.println("List is empty");
            return;
        }else if(this.head == this.tail){
            this.head = null;
            this.tail = null;
            this.size = 0;
            return;
        }else{
            CircularNode newNode = this.head.next;
            this.tail.next = newNode;
            this.head = newNode;
            this.size--;
        }
    }

    void delete_at_tail(){
        if(this.isEmpty()){
            System.out.println("List is empty");
            return;
        }else if(this.tail == this.head){
            this.head = null;
            this.tail = null;
            this.size = 0;
            return;
        }else{
            CircularNode temp = this.head;

            while (temp.next != this.tail){
                temp = temp.next;
            }

            temp.next = this.head;
            this.tail = temp;

        }
    }

    void listSize(){
        System.out.println("Size of list: "+this.size);
    }


    void display(){
        if(isEmpty()){
            System.out.println("List is empty");
            return;
        }else{
            System.out.print(this.head.data + "-->");
            CircularNode temp = this.head.next;

            while(temp != this.head){
                System.out.print(temp.data + "-->");
                temp = temp.next;
            }

            System.out.println(temp.data+"-->");
        }
    }


    public static void main(String[] args){
        CircularLinkedListPractice cl = new CircularLinkedListPractice();

        System.out.println("List Empty: "+cl.isEmpty());

        cl.insert_at_head(12);
        cl.insert_at_head(14);
        cl.insert_at_head(45);
        cl.insert_at_head(31);
        cl.insert_at_head(91);
        cl.insert_at_head(56);

        cl.listSize();

        cl.display();

        cl.delete_at_head();

        cl.display();

        cl.delete_at_tail();

        cl.display();
    }
}
