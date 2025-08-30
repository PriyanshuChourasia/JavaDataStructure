package priyalProjects;

import java.util.Scanner;

public class Frequencyone {
    int count = 0;
    public int countFrequency(int[] nums){
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 42){
                count++;
            }
        }
        return count;
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Frequencyone frequencyone = new Frequencyone();
        int[] arr = new int[50];

        System.out.println("Enter array val: ");

        for(int i=0; i<50; i++){
            arr[i] = sc.nextInt();
        }

        int count = frequencyone.countFrequency(arr);

        System.out.println("The count of no 42 in array is: "+count);


        sc.close();
    }
}
