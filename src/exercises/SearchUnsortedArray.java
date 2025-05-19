package exercises;

import java.util.Scanner;

public class SearchUnsortedArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] numarr = {1,34,54,23,67,81,12,1,25,54,1,234,1,2,1,67,34,2,1,2};

        System.out.println("Enter the target: ");
        int target = sc.nextInt();

        for(int i=0; i<numarr.length; i++)
        {
            if(numarr[i] == target){
                System.out.println("Target is found");
                break;
            }
        }

        sc.close();
    }
}
