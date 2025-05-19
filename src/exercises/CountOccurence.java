package exercises;

import java.util.Scanner;

public class CountOccurence {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] arr ={1,34,54,23,67,81,12,1,25,54,1,234,1,2,1,67,34,2,1,2};

        System.out.println("Enter the target: ");
        int target = sc.nextInt();

        int firstIndex = -1;
        int lastIndex = -1;
        int count = 0;

        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] == target && count == 0){
                firstIndex = i;
                lastIndex = i;
                count++;
            }else if(arr[i] == target && count > 0){
                lastIndex = i;
            }
        }

        System.out.println("First Index: "+firstIndex);
        System.out.println("Last Index: "+lastIndex);

        sc.close();
    }
}
