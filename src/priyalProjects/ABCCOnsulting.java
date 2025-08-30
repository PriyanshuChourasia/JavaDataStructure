package priyalProjects;

import java.util.Scanner;

public class ABCCOnsulting {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[][] register = new int[5][7];
        int[] totalHours = new int[5];
        int sum = 0;

        System.out.println("Enter times:");
        for (int i=0; i<5; i++){
            for(int j=0; j<7; j++){
                register[i][j] = sc.nextInt();
            }
            System.out.println("--------------------------------------");
        }

        for(int i=0; i<5;i++){
            sum = 0;
            for(int j=0; j<7; j++){
                sum = sum + register[i][j];
            }
            totalHours[i] = sum;
        }

        for(int i=0; i<5;i++){
            System.out.println("Employee "+i+" totalhours"+"="+ totalHours[i]);
        }

        sc.close();
    }
}
