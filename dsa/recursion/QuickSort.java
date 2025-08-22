package dsa.recursion;

public class QuickSort {

    static void divide(int arr[], int i,int j){
        if(i>j){
            return;
        }
        int pivot = partition(arr,i,j);

        divide(arr, i, pivot-1);
        divide(arr, pivot+1, j);

    }

    static int partition(int [] arr, int i, int j){
        int pivot = arr[j];
        int low= i-1;

        for(int k = i; k<j; k++){
            if(arr[k] <= pivot){
                low++;
                int temp = arr[low];
                arr[low] = arr[k];
                arr[k] = temp;
            }
        }

        int temp = arr[low+1];
        arr[low+1] = arr[j];
        arr[j] = temp;

        return low+1;
    }

    public static void main(String[] args) {
        int arr[] = {123,2,34,4,4,23};

        divide(arr, 0, arr.length-1);
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }

    }
}
