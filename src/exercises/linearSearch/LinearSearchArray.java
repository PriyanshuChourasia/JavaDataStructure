package exercises.linearSearch;

import java.util.Scanner;

public class LinearSearchArray {
    public static  void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] arr;

        System.out.println("Enter size of array: ");
        int num = sc.nextInt();

        arr = new int[num];

        for(int i=0; i<num; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter target: ");

        int target = sc.nextInt();

        for(int j=0; j<num; j++)
        {
            if(arr[j] == target)
            {
                System.out.println("Target found");
                break;
            }
        }

        sc.close();
    }
}
