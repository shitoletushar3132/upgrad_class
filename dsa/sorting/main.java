package dsa.sorting;

class Main {
    public static void insertionSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int j = i;
            while (j > 0 && arr[j] < arr[j - 1]) {
                int temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
    }

    public static void bubbleSort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length-1-i; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void selectionSort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int minKey = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minKey] > arr[j]) {
                    minKey = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minKey];
            arr[minKey] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 23, 1, 34, 12, 43 };
        // insertionSort(arr);
        selectionSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}