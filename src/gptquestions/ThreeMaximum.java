package gptquestions;

import java.util.Scanner;

public class ThreeMaximum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter one: ");
        int a = sc.nextInt();
        System.out.println("Enter two: ");
        int b = sc.nextInt();
        System.out.println("Enter three: ");
        int c = sc.nextInt();

        if(a>b){
            if(a>c){
                System.out.println("A is bigger");
            }else if(a<c){
                System.out.println("C is bigger");
            }else {
                System.out.println("A and C is bigger");
            }
        }else if(b>a){
            if(b>c){
                System.out.println("B is bigger");
            }else if (c>b){
                System.out.println("C is bigger");
            }else {
                System.out.println("B and C is bigger");
            }
        }else if(a==b){
            if(a==c){
                System.out.println("A,B,C is bigger");
            }else if(a>c){
                System.out.println("A and B is bigger");
            }else if(a<c){
                System.out.println("c is bigger");
            }
        }

        sc.close();
    }
}
