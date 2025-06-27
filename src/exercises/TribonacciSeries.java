package exercises;

import java.util.Scanner;

public class TribonacciSeries {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number: ");
        int n = sc.nextInt();
         int a = 0;
         int b = 0;
         int c = 1;
         int tempc = 0;
         int tempb = 0;
         int d = 0;

         System.out.print(a+",");
         System.out.print(b+",");
        System.out.print(c+",");

         for(int i=0; i<=n; i++)
         {
             d = a+b+c;
             a = b;
             b = c;
             c = d;
             System.out.print(c+",");
         }


        sc.close();
    }
}
