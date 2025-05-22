package exercises;

import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr;
        System.out.println("Enter the size");
        int num = sc.nextInt();
        System.out.println("Enter target");
        int target = sc.nextInt();
        arr = new int[num];
        for(int i=0; i<num; i++)
        {
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<num; i++)
        {
            for(int j=i+1; j<num; j++)
            {
                if(arr[i] + arr[j] == target)
                {
                    System.out.println(i+" "+j);
                    break;
                }
            }
        }


        sc.close();
    }
}
