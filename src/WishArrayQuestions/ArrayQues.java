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

//    sum of the array
    public int sum3(int[] nums){
        int sum = 0;
        for(int n : nums){
            sum = sum + n;
        }
        return sum;
    }
//    Return a new rotated array upto three steps
    public int[] rotate3(int[] nums){
        int[] newRotate = new int[nums.length];
        for(int i=0; i<nums.length; i++)
        {
            int b = i + 2;
            if(b<nums.length){
                newRotate[b] = nums[i];
            }else{
                int a = b - nums.length;
                newRotate[a] = nums[i];
            }

        }
        return newRotate;
    }

//    Return a reverse array
    public int[] reverse3(int[] nums){
        int[] rev = new int[nums.length];
        int len = nums.length - 1;
        for(int i=0; i<nums.length; i++){
            rev[i] = nums[len];
            len--;
        }
        return rev;
    }

// Return the max num in the array
    public int[] maxEnd3(int[] nums){
        int max = 0;
        for(int i=0; i<nums.length; i++){
            if(max < nums[i]){
                max = nums[i];
            }
        }

        for(int i=0; i<nums.length; i++){
            nums[i] = max;
        }
        return  nums;
    }

//    Sum of first two element
    public int sum2(int[] nums){
        int sum = 0;
        if(nums.length == 0){
            return 0;
        }else if(nums.length == 1){
            return nums[0];
        }else{
            for(int i=0; i<2; i++){
                sum = sum + nums[i];
            }
            return sum;
        }
    }

//    Return new array with middle values of two array
    public int[] middleval(int[] num1, int[] num2){
        int[] nums = new int[2];
        int mid1 = num1.length / 2;
        int mid2 = num2.length / 2;
        nums[0] = num1[mid1];
        nums[1] = num2[mid2];
        return nums;
    }

//    Return new array length 2 containing the first and last elements
    public int[] makeEnds(int[] nums){
        int[] newArr = new int[2];
        newArr[0] = nums[0];
        newArr[1] = nums[nums.length - 1];
        return newArr;
    }

//    Return true if it contains a 2 or a 3
    public boolean has23(int[] nums){
        boolean found = false;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 2 || nums[i] == 3){
                found = true;
                break;
            }
        }
        return found;
    }
//    Return true if it does not contains a 2 or 3
    public boolean no23(int[] nums){
        boolean found = true;
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i] == 2 || nums[i] == 3){
                found = false;
                break;
            }
        }
        return found;
    }

//    new array with double the size and rest place will have a zero and last will contain last element
    public int[] makeLast(int[] nums){
        int[] lastarr = new int[nums.length * 2];
        int lastelement = nums[nums.length - 1];
        for(int i=0; i<lastarr.length - 1; i++){
            lastarr[i] = 0;
        }
        lastarr[lastarr.length -1] = lastelement;
        return lastarr;
    }

//    Return true if it contains two 2s or two 3s
    public boolean double23(int[] nums){
        int cnt2 = 0;
        int cnt3 = 0;
        boolean found = false;

        for(int i=0; i<nums.length; i++){
            if(nums[i] == 2){
                cnt2++;
                if(cnt2 == 2){
                    found = true;
                    break;
                }
            }else if(nums[i] == 3){
                cnt3++;
                if(cnt3 == 2){
                    found = true;
                    break;
                }
            }
        }
        return found;
    }

//    return 0 if 3 is followed by 2
    public int[] fix23(int[] nums){
        for(int i=0; i<nums.length; i++){
            if (nums[i] == 2 && nums[i=i+1] == 3){
                nums[i++] = 0;
                break;
            }
        }
        return nums;
    }

//    return how many have their 1 as their first element
    public int start1(int[] nums, int[] nums1){
        return nums[0] == 1 ? nums1[0] == 1 ? 2 : 1 : 0;
    }

//    return the bigger array
    public int[] bigger(int[] aa, int[] bb){
        int sum1 = 0;
        int sum2 = 0;

        for(int i=0; i<aa.length; i++){
            sum1 = sum1 + aa[i];
        }

        for(int j=0; j<bb.length; j++){
            sum2 = sum2 + bb[j];
        }

        if(sum1 > sum2){
            return aa;
        }
        else if(sum1 < sum2){
            return bb;
        }else {
            return aa;
        }
    }

//    return a new array of returning two middle elements
    public int[] makeMiddle(int[] nums){
        int[] makeMiddle = new int[2];
        int mid = nums.length / 2;
        makeMiddle[0] = nums[mid - 1];
        makeMiddle[1] = nums[mid];
        return makeMiddle;
    }

//    return a new array joining two array
    public int[] plusTwo(int[] aa, int[] bb){
        int totlen = aa.length + bb.length;
        int[] twoarr = new int[totlen];
        int a = 0;

        for(int i=0; i<twoarr.length; i++){
            if(i < aa.length){
                twoarr[i] = aa[i];
            }
            else{
                twoarr[i] = bb[a];
                a= a+ 1;
            }
        }
        return twoarr;
    }

//    swap the first and last element

    public int[] swapsEnd(int[] nums){
        int first = nums[0];
        int last = nums[nums.length - 1];
        nums[0] = last;
        nums[nums.length - 1] = first;
        return  nums;
    }

//    return mid three from array
    public int[] midThree(int[] nums){
        int mid = nums.length / 2;
        int first = nums[mid - 1];
        int middle = nums[mid];
        int last = nums[mid + 1];
        int[] midarr = new int[3];
        midarr[0] = first;
        midarr[1]  = middle;
        midarr[2] = last;
        return midarr;
    }

//    return the maxnum
    public int maxTriple(int[] nums){
        int max = nums[0];
        for(int i=0; i<nums.length; i++){
            if(max < nums[i]){
                max = nums[i];
            }
        }
        return max;
    }

    public int[] frontPiece(int[] nums){
        if(nums.length == 0){
            return nums;
        }else if(nums.length == 1){
            return nums;
        }else{
            int[] newArr = new int[2];
            newArr[0] = nums[0];
            newArr[1] = nums[1];
            return newArr;
        }
    }

    public boolean unlucky1(int[] nums){
        if(nums[0] == 1 && nums[1] == 3){
            return true;
        }else if(nums[nums.length - 2] == 1 && nums[nums.length - 1] == 3){
            return true;
        }else{
            return false;
        }
    }

    public int[] make2(int[] a, int[] b){
        int[] arr = new int[2];
        if(a.length > 2){
            arr[0] = a[0];
            arr[1] = a[1];
            return arr;
        }else {
            arr[0] = a[0];
            arr[1] = b[0];
            return  arr;
        }
    }

    public int[] front11(int[] a, int[] b){


        if(a.length == 0){
            int[] arr = new int[1];
            arr[0] = b[0];
            return arr;
        }else if(b.length == 0){
            int[] arr = new int[1];
            arr[0] = a[0];
            return arr;
        }else {
            int[] arr = new int[2];
            arr[0] = a[0];
            arr[1] = b[1];
            return arr;
        }
    }

    public boolean firstorlast6(int[] nums){
        if(nums[0] == 6 || nums[nums.length -1] == 6){
            return true;
        }else if(nums[0] == nums[nums.length -1]){
            return true;
        }else{
            return false;
        }
    }

    public  int[] combineEnds(int[] a, int[] b){
        int[] arr = new int[4];
        arr[0] = a[0];
        arr[1] = a[a.length -1];
        arr[2] = b[0];
        arr[3] = b[b.length - 1];
        return arr;
    }

    public int makeFirstLastSum(int[] nums){
        int sum1 = nums[0] + nums[1];
        int sum2 = nums[1] + nums[2];
        if(sum1 > sum2){
            return sum1;
        }else {
            return sum2;
        }
    }
}




public class ArrayQues {
    public static void main(String[] args){
        ArrayMethods arrayMethods = new ArrayMethods();
//        int[] arrs = {3,2,6};
//        System.out.println(arrayMethods.firstLast6(arrs));
//        int[] sameFL = {1,1};
//        System.out.println(arrayMethods.sameFirstLast(sameFL));
////        Why I have to wrap this method into Arrays toString();
//        System.out.println(Arrays.toString(arrayMethods.makepi()));
//        int[] arr = {1,2,3};
//        int[] brr = {1,3};
//        System.out.println(arrayMethods.commonEnd(arr,brr));
//        int[] sums3 = {5,11,2};
//        System.out.println(arrayMethods.sum3(sums3));
//        int[] rotateNums = {7,0,0};
//        System.out.println(Arrays.toString(arrayMethods.rotate3(rotateNums)));
//        int[] revarr = {5,11,9};
//        System.out.println(Arrays.toString(arrayMethods.reverse3(revarr)));
//        int[] maxNum = {11,5,9};
//        System.out.println(Arrays.toString(arrayMethods.maxEnd3(maxNum)));
//        int[] sumoftwo = {2,3,4};
//        System.out.println(arrayMethods.sum2(sumoftwo));
//        int[] num1 = {7,7,7};
//        int[] num2 = {3,8,0};
//        System.out.println(Arrays.toString(arrayMethods.middleval(num1,num2)));
//        int[] nums = {1,2,3,4,5,6};
//        System.out.println(Arrays.toString(arrayMethods.makeEnds(nums)));
//        int[] nums = {6,5};
//        System.out.println(arrayMethods.has23(nums));
//        int[] nums = {2,5};
//        System.out.println(arrayMethods.no23(nums));
//        int[] nums = {3};
//        System.out.println(Arrays.toString(arrayMethods.makeLast(nums)));
//        int[] nums = {3,3};
//        System.out.println(arrayMethods.double23(nums));
//        int[] nums = {2,3,5};
//        System.out.println(Arrays.toString(arrayMethods.fix23(nums)));
//        int[] nums = {9,2,3};
//        int[] nums2 = {5,3};
//        System.out.println(arrayMethods.start1(nums,nums2));
//        int[] nums1 = {3,6};
//        int[] nums2 = {3,8};
//        System.out.println(Arrays.toString(arrayMethods.bigger(nums1,nums2)));
//        int[] nums = {1,2};
//        System.out.println(Arrays.toString(arrayMethods.makeMiddle(nums)));
//        int[] nums1 = {1,2};
//        int[] nums2 = {3,4,5};
//        System.out.println(Arrays.toString(arrayMethods.plusTwo(nums1,nums2)));
//        int[] nums = {1,2,3,4};
//        System.out.println(Arrays.toString(arrayMethods.swapsEnd(nums)));
//        int[] nums = {1,2,3,4,5};
    }
}
