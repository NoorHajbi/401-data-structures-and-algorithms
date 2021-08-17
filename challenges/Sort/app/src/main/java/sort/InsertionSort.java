package sort;

public class InsertionSort {
    /**
     * Selection Sort is a sorting algorithm
     * The traversal keeps track of the minimum value and places it in the front of the array
     * which should be incrementally sorted.
     **/
    public int[] selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int j = i - 1;
            int temp = arr[i];

            while (j >= 0 && temp < arr[j]) {
                arr[j + 1] = arr[j];
                j -= 1;
            }

            arr[j + 1] = temp;
        }
        return arr;
    }

    public int[] selectionSortDescending(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int j = i - 1;
            int temp = arr[i];

            while (j >= 0 && temp > arr[j]) {
                arr[j + 1] = arr[j];
                j -= 1;
            }

            arr[j + 1] = temp;
        }
        return arr;
    }

}

