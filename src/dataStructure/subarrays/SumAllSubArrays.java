package dataStructure.subarrays;

import java.util.Scanner;

public class SumAllSubArrays {

    public void sumOfArray(int[] nums){
        int sum = 0;
        for(int i=0; i<nums.length; i++){
            sum =0;
            for(int j=i; j<nums.length; j++){
               sum+=nums[j];
               System.out.println(sum);
            }
        }

    }

    public static void main(String[] args){
        SumAllSubArrays sumAllSubArrays = new SumAllSubArrays();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size: ");
        int size = sc.nextInt();

        int[] nums = new int[size];

        for(int i=0; i<size; i++){
            nums[i] = sc.nextInt();
        }
        sumAllSubArrays.sumOfArray(nums);

        sc.close();
    }
}
