package gptquestions.array2d;

import java.util.Scanner;

public class Array {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter cols: ");
        int cols = sc.nextInt();

        int[][] arr = new int[rows][cols];

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("2d array print: ");

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.println(arr[i][j]);
            }
        }
        sc.close();
    }
}
