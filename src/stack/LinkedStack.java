package stack;

public class LinkedStack {

    class Node{
        Integer data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

        Node head;

        boolean isEmpty(){
            return this.head == null;
        }

        void push(int data){
            Node newNode = new Node(data);
            if(this.isEmpty()){
                newNode.next = this.head;
                this.head = newNode;
                return;
            }
            else{
                newNode.next = this.head;
                this.head = newNode;
            }
        }

        void pop(){
            if(this.isEmpty()){
                System.out.println("Stack is empty");
                return;
            }else{
                Node temp = this.head;
                this.head = this.head.next;
                System.out.println("Element popped out: "+temp.data);
                temp = null;
                return;
            }
        }

        void peek(){
            if (this.isEmpty()){
                System.out.println("Stack is empty");
                return;
            }else{
                System.out.println("Peek Element: "+ this.head.data);
                return;
            }
        }

        void display(){
            if(this.isEmpty()){
                System.out.println("Stack is Empty");
                return;
            }else{
                Node temp = this.head;
                while (temp != null){
                    System.out.print(temp.data+" --> ");
                    temp = temp.next;
                }
            }
        }

    public static void main(String[] args){
        LinkedStack stack = new LinkedStack();

        System.out.println("Stack status: "+stack.isEmpty());

        stack.push(12);
        stack.push(13);
        stack.push(14);
        stack.push(15);
        stack.push(78);

        stack.peek();

        stack.display();

        stack.pop();

        stack.peek();

        stack.display();

        System.out.println("Stack status: "+stack.isEmpty());
    }
}
