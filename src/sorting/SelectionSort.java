package sorting;

import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr;

        System.out.println("Enter the size: ");
        int num = sc.nextInt();

        System.out.println("Enter array: ");
        arr = new int[num];

        for(int i=0; i<num; i++)
        {
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<num; i++)
        {
            int temp = arr[i];
            int k = i;
            for(int j=i+1; j<num; j++)
            {
                if(arr[k] > arr[j])
                {
                    k=j;
                }
            }
            arr[i] = arr[k];
            arr[k] = temp;
        }

        System.out.println("Sorted Array");

        for(int i=0; i<num; i++)
        {
            System.out.print(arr[i] + ",");
        }


        sc.close();
    }
}
