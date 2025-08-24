package gptquestions;

public class MaxSubArray {

    public int maxArray(int[] maxarr){
        int max = maxarr[0];

        for(int i=0; i<maxarr.length; i++){
            int currentSum=0;
            for(int j=i; j<maxarr.length; j++){
                currentSum = currentSum + maxarr[j];
                if(currentSum > max){
                    max = currentSum;
                }
            }
        }
        return max;
    }

    public static void main(String[] args){

        MaxSubArray maxSubArray = new MaxSubArray();
        int[] arr = {5,4,-1,7,8};

        int max = maxSubArray.maxArray(arr);
        System.out.println("Maximum sum: "+max);
    }
}
