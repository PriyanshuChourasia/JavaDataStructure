package stack;

public class ArrayStack {
    int size;
    int capacity;
    int[] a;

    public ArrayStack(int cap){
        this.capacity = cap;
        this.size = 0;
        a = new int[cap];
    }

    public boolean create(int data){
        if(this.size > this.capacity){
            System.out.println("Stack is overflow");
            return false;
        }

        a[this.size] = data;
        ++this.size;
        return true;
    }

    public boolean is_Empty(){
        return this.size == 0;
    }

    public void pop(){
        if(is_Empty()){
            System.out.println("Stack is Empty, Operation cannot be performed");
        }else{
            System.out.println("Pop Value: "+ this.a[this.size - 1]);
            this.a[this.size] = -1;
            this.size--;
        }
    }

    public void peek(){
        System.out.println("Peek Value");
        if(is_Empty()){
            System.out.println("Stack is empty");
            return;
        }else{
            System.out.println(this.a[this.size - 1]);
        }
    }


    public static void main(String[] args){
        ArrayStack stack  = new ArrayStack(6);
        stack.create(45);
        stack.create(56);
        stack.create(78);
        stack.create(90);
        stack.create(101);
        stack.peek();
        stack.pop();
        stack.peek();
    }
}
