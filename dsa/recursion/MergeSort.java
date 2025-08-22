package dsa.recursion;
public class MergeSort {

    static void divide(int arr[], int i, int j){
        if(i>=j){
            return;
        }


        int mid = (i+j)/2;

        divide(arr, i, mid);
        divide(arr, mid+1, j);

        merge(arr, i, j, mid);
    }

    static void merge(int arr[], int i, int j, int mid){
        int n1 = mid-i+1;
        int n2 = j-mid;

        int left[] = new int[n1];
        int right[] = new int[n2];

        for(int k=0; k<n1; k++){
            left[k] = arr[i+k];
        }

        for(int k=0; k<n2; k++){
            right[k] = arr[mid+k+1];
        }

        int x=0; 
        int y=0; 
        int k=i;

        while(x<n1 && y<n2){
            if(left[x] < right[y]){
                arr[k] = left[x];
                x++;
                
            }else{
                arr[k] = right[y];
                y++;
            }
            k++;
        }

        while (x<n1) {
            arr[k] = left[x];
            x++;
            k++;
        }

        while (y<n2) {
            arr[k] = right[y];
            y++;
            k++;
        }
    }

    public static void main(String[] args) {
        int [] arr = {1,23,4,56,332,45};
        divide(arr, 0, arr.length-1 );
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
