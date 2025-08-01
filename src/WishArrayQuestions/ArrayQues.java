package WishArrayQuestions;


import java.util.Arrays;

class ArrayMethods{

//    First and Last six
    public boolean firstLast6(int[] nums){
        if(nums.length < 1){
            return false;
        }else if(nums.length == 1){
            if(nums[0] == 6){
                return true;
            }else{
                return false;
            }
        }
        else return nums[0] == 6 || nums[nums.length - 1] == 6;
    }

//    Same First Last
    public boolean sameFirstLast(int[] nums){
        if(nums.length < 1){
            return false;
        }else if(nums.length == 1){
            return true;
        }
        else return nums[0] == nums[nums.length - 1];
    }
//    Make PI
    public int[] makepi(){
        int[] piarr = {3,1,4};
        return piarr;
    }
//    Common ends of two array
    public boolean commonEnd(int[] a, int[] b){
        if (a.length < 1 || b.length < 1){
            return false;
        }
        else return a[a.length - 1] == b[b.length - 1];
    }
}




public class ArrayQues {
    public static void main(String[] args){
        ArrayMethods arrayMethods = new ArrayMethods();
        int[] arrs = {3,2,6};
        System.out.println(arrayMethods.firstLast6(arrs));
        int[] sameFL = {1,1};
        System.out.println(arrayMethods.sameFirstLast(sameFL));
//        Why I have to wrap this method into Arrays toString();
        System.out.println(Arrays.toString(arrayMethods.makepi()));
        int[] arr = {1,2,3};
        int[] brr = {1,3};
        System.out.println(arrayMethods.commonEnd(arr,brr));
    }
}
