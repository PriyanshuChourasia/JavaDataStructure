package TimeComplexity;

public class SearchSortedArray {

    public int findNum(int[] nums,int target){
        int low = 0;
        int high = nums.length;

        while (low<high){
            int mid = low + (high - low) / 2;

            if(nums[mid] == target){
                return mid;
            }

            if(nums[mid] < target){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        SearchSortedArray searchSortedArray = new SearchSortedArray();
        int[] nums = {2,4,6,8,10};
        int result = searchSortedArray.findNum(nums,12);

        if (result == -1){
            System.out.println("Target not found");
        }else{
            System.out.println("Target found");
        }
    }
}
