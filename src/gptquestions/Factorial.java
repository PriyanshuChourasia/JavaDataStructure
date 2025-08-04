package gptquestions;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number and get Factorial: ");
        int num = sc.nextInt();

        int i=1;
        int mul = 1;
        while(i<=num){
            mul = mul * i;
            i++;
        }

        System.out.println("Factorial : "+mul);

        sc.close();
    }
}
