package stack;

import java.util.Stack;

public class SimpleStack {
    public static void main(String[] args){
        Stack<Integer> stack = new Stack<>();

        stack.push(23);
        stack.push(24);
        stack.push(25);
        stack.push(26);
        stack.push(27);

        System.out.println(stack.size());
        System.out.println("Top element: "+ stack.peek());
        System.out.println("Popped element: "+ stack.pop());
        System.out.println("is The Stack empty? "+ stack.isEmpty());
        System.out.println(stack.size());
    }
}
