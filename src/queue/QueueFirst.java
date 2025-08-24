package queue;

public class QueueFirst {
    static class Queue{
        int[] arr;
        int front;
        int rear;
        Queue(int size){
            this.arr = new int[size];
            this.front = -1;
            this.rear = 0;
        }
    }

    boolean isFull(Queue q){
        return q.rear == q.arr.length;
    }

    boolean isEmpty(Queue q){
        return q.front == q.rear - 1;
    }

    void enqueue(Queue q,int val){
        if(isFull(q)){
            System.out.println("Queue is full");
            return;
        }
        q.arr[q.rear] = val;
        q.rear++;
    }

    void dequeue(Queue q){
        if(isEmpty(q)){
            System.out.println("Queue is empty");
            return;
        }
        q.front++;
    }

    int peek(Queue q){
        if(isEmpty(q)){
            System.out.println("Queue is empty");
            return - 1;
        }
        return q.arr[q.front+1];
    }
    void print_queue(Queue q){
        if(isEmpty(q)){
            System.out.println("Queue is empty");
            return;
        }

        for(int i=q.front+1; i<q.rear; i++){
            System.out.println(q.arr[i]);
        }
    }


    public static void main(String[] args){
        QueueFirst queueFirst = new QueueFirst();
        Queue queue = new Queue(19);

        for(int i=0; i<4; i++){
            queueFirst.enqueue(queue,i);
        }

        queueFirst.print_queue(queue);
        int peek = queueFirst.peek(queue);
        System.out.println("Peek Queue: "+peek);
        queueFirst.dequeue(queue);

        System.out.println("Print Queue");
        queueFirst.print_queue(queue);

        peek = queueFirst.peek(queue);
        System.out.println("Peek Queue: "+peek);
    }
}
