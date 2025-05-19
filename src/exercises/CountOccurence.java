package exercises;

import java.util.Scanner;

public class CountOccurence {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] arra = {1,34,54,23,67,81,12,1,25,54,1,234,1,2,1,67,34,2,1,2};

        System.out.println("Enter the target: ");
        int target = sc.nextInt();

        int count = 0;

        for(int i=0; i<arra.length; i++){
            if(arra[i] == target){
                count++;
            }
        }

        System.out.println(target + " occurs about "+count);

        sc.close();
    }
}
