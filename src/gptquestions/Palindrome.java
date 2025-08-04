package gptquestions;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = sc.nextInt();
        int num2 = num;
        int rev = 0;

        while (num > 0){
            int rem = num%10;
            rev = rev * 10 + rem;
            num = num / 10;
        }

        if(rev == num2){
            System.out.println("Its Palindrome");
        }else {
            System.out.println("Its not a Palindrome");
        }

        sc.close();
    }
}
