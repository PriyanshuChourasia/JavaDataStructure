package gptquestions;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = sc.nextInt();

        int i=2;
        boolean prime = true;

        while (i<num){
            if(num % i == 0){
                prime = false;
                break;
            }
            i++;
        }

        if(prime){
            System.out.println("Prime number");
        }else{
            System.out.println("Composite number");
        }


        sc.close();
    }
}
