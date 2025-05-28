package array;

import java.util.Scanner;

public class CircularArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] arr;

        System.out.println("Enter the size: ");
        int num = sc.nextInt();

        System.out.println("Enter array nums: ");
        arr = new int[num];

        for(int i=0; i<num; i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("Print All element: ");

        int j=0;
        int x = 0;


        for(j= j % num; j<=num; j++){
            System.out.println(arr[j%num]);
            System.out.println("J: "+j);
        }

        sc.close();
    }
}
