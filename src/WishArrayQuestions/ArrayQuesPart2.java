package WishArrayQuestions;

import java.util.Scanner;


class Array2{

//    Count the number of even integers in the array.
    public int counteven(int[] nums){
        int count = 0;
        for(int i =0; i<nums.length; i++){
            if(nums[i] % 2 == 0){
                count++;
            }
        }
        return count;
    }

//   Return the difference between the largest and smallest values in the array.
    public int diff(int[] nums){
        int max = nums[0];
        int small = nums[0];
        for(int i=0; i<nums.length; i++){
            if(max < nums[i]){
                max = nums[i];
            }

            if(small > nums[i]){
                small = nums[i];
            }
        }

        return max - small;
    }

//    Return the mean average of the array values, ignoring the largest and smallest values.

    public int avgVal(int[] nums){
        int max = nums[0];
        int small = nums[0];
        int sum = 0;

        for(int i=0; i<nums.length; i++){
            sum = sum + nums[i];
            if(max<nums[i]){
                max = nums[i];
            }

            if(small > nums[i]){
                small = nums[i];
            }
        }
        int total = max + small;
        int totalen = nums.length - 2;
        int avg = (sum - total) / totalen;
        return avg;
    }

//    Return the sum of the numbers in the array, skipping any number that is 13 and the number immediately following it.
    public int numfollow13(int[] nums){
        int sum = 0;
        int followSum = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 13 && i < nums.length - 1){
                followSum = nums[i] + nums[i+1];
            }else if(nums[i] == 13){
                followSum = followSum + nums[i];
            }
            sum = sum + nums[i];
        }

        int diff = sum > followSum ? sum - followSum : followSum - sum;
        return diff;
    }

//    Return true if the array contains a 2 next to a 2.

    public boolean twoto2(int[] nums){
        for(int i =0; i<nums.length; i++){
            if( i < nums.length - 1 && nums[i] == 2 && nums[i+1] == 2){
                return true;
            }
        }
        return false;
    }

//    Return true if the array does not contain any 1's or 3's.

    public boolean contain1to3(int[] nums){
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 1 || nums[i] == 3){
                return false;
            }
        }
        return true;
    }

//    Return true if the sum of all the 2's in the array is exactly 8.
    public boolean sum8(int[] nums){
        int sum = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 2){
                sum = sum + nums[i];
            }
        }

        if(sum == 8){
            return true;
        }else{
            return false;
        }
    }

//    Return true if the number of 1's is greater than the number of 4's.
    public boolean oneFourSum(int[] nums){
        int onesum = 0;
        int foursum = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 1){
                onesum++;
            }
            else if(nums[i] == 4){
                foursum++;
            }
        }

        if(onesum > foursum){
            return true;
        }else{
            return false;
        }
    }

//    Return true if every element is a 1 or a 4.
    public boolean everyEle1or4(int[] nums){
        for(int i=0; i<nums.length; i++){
            if(nums[i] != 1 && nums[i] != 4){
                return false;
            }
        }
        return true;
    }

//    Return true if the array contains two 7's next to each other or separated by one element.

    public boolean found7separate(int[] nums){
        for(int i=0; i<nums.length; i++){
            if(i< nums.length - 1 && nums[i] == 7 && nums[i+1] == 7 || i < nums.length - 2 && nums[i] == 7 && nums[i+2] == 7){
                return true;
            }
        }
        return false;
    }

//    Return true if all elements in the inner array appear in the outer array in the same order.

    public boolean outerInnerCheck(int[] num1, int[] num2){
        int a = 0;
        for(int i=0; i<num1.length; i++){
            if(num1[i] == num2[0]){
                System.out.println("entered");
                a=i;
                for(int j=0; j<num2.length; j++) {
                    if(num2[j] != num1[a]){
                        return false;
                    }
                    a++;
                }
                break;
            }
        }
        return true;
    }
}

public class ArrayQuesPart2 {
    public static void main(String[] args){
        Array2 array2 = new Array2();
        int[] nums = {1,2,4,6};
        int[] nums2 = {2,3};
//        System.out.println(array2.counteven(nums));
//        System.out.println(array2.diff(nums));
//        System.out.println(array2.avgVal(nums));
//        System.out.println(array2.numfollow13(nums));
//        System.out.println(array2.twoto2(nums));
//        System.out.println(array2.contain1to3(nums));
//        System.out.println(array2.sum8(nums));
//        System.out.println(array2.oneFourSum(nums));
//        System.out.println(array2.everyEle1or4(nums));
//        System.out.println(array2.found7separate(nums));
        System.out.println(array2.outerInnerCheck(nums,nums2));




//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter size: ");
//        int size = sc.nextInt();
//        System.out.println("Enter number: ");
//        int[] arr = new int[size];
//        for(int i=0; i<size; i++){
//            arr[i] = sc.nextInt();
//        }
//
//
//
//        sc.close();
    }
}
