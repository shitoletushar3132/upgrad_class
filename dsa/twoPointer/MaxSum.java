package dsa.twoPointer;
public class MaxSum {


    static void sliding(int [] arr, int k){
        int currSum =0;

        for(int i=0; i<k; i++){
            currSum += arr[i];
        }

        int maxSum = currSum;
        for(int i=k; i<arr.length; i++){
            currSum =currSum - arr[i-k] + arr[i];
            maxSum = Math.max(currSum, maxSum);
        }

        System.out.println(maxSum);

    }

    public static void main(String[] args) {
        int arr [] = {4,2,6,8,2,5,7,3,8,9,4};
        int k=3;

        sliding(arr, k);

    }
    
}
