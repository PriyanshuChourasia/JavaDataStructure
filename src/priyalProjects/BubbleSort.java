package priyalProjects;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public int[] bubbleSorting(int[] nums){
        for(int i=0; i<nums.length - 1;i++){
            for(int j=0; j< nums.length - i -1; j++){
                if(nums[j] < nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        return nums;
    }

    public static void main(String[] args){
        BubbleSort bubbleSort = new BubbleSort();
        int[] nums = {5, 6, 67, 34, 32, 32, 23, 2, 1, 89};
        System.out.println(Arrays.toString(bubbleSort.bubbleSorting(nums)));
    }
}
