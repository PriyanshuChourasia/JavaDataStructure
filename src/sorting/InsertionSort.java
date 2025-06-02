package sorting;

import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] arr;

        System.out.println("Enter size: ");
        int size = sc.nextInt();

        arr = new int[size];
        System.out.println("Enter the array: ");
        for(int i=0; i<size; i++)
        {
            arr[i] = sc.nextInt();
        }


        for(int i=0; i<size; i++)
        {
            int key = arr[i];
            int j= i-1;
            while (j>=0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }

        System.out.println("Sorted array: ");

        for(int i=0; i<size; i++)
        {
            System.out.println(arr[i]);
        }

        sc.close();
    }
}
