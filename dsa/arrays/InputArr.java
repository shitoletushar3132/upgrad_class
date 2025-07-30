package dsa.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InputArr {
    public static void minMax(int [] arr){
        int max = arr[0];
        int min = arr[0];

        for(int i=1; i<arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
            if(min > arr[i]){
                min = arr[i];
            }
        }

        System.out.println("max "+max);
        System.out.println("min" +min);
    }

    public static int findEle(int [] arr, int target){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }

    public static List<List<Integer>> sumPair(int[]arr, int target){
        List<List<Integer>> pairs = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]+ arr[j] == target){
                    pairs.add(new ArrayList<>(Arrays.asList(arr[i],arr[j])));
                }
            }
        }

        return int num[]
        return pairs;

    }

    public static void main(String[] args) {
        int [] arr = {2,5,7,9,6,6};
        minMax(arr);
        System.out.println(findEle(arr, 0));
        System.out.println(sumPair(arr, 12));
    }
    
}
