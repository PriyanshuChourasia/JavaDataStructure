package gptquestions;


import java.util.Scanner;

public class SumTwo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number one: ");
        int a = sc.nextInt();
        System.out.println("Enter number two: ");
        int b = sc.nextInt();

        int c = a+b;
        System.out.println("Sum: "+c);

        sc.close();
    }
}
