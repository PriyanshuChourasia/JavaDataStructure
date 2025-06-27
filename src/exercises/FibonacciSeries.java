package exercises;

import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Fibonacci Series");

        System.out.println("Enter number: ");
        int n = sc.nextInt();

        int a = 0;
        int b = 1;

        System.out.print(a+",");
        System.out.print(b+",");

        for(int i=0; i<=n; i++)
        {
            System.out.print(b+",");
            b = b + a;
            a = b - a;
        }

        sc.close();
    }
}
