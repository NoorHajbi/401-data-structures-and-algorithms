package sort;

import java.util.Arrays;

public class MergeSort {

    public void mergeSort(int[] arr) {
        int n = arr.length;
        if (n <= 1) {
            return;
        }
        int mid = n / 2;
        int[] left = Arrays.copyOfRange(arr, 0, mid);
        int[] right = Arrays.copyOfRange(arr, mid, arr.length);

        // sort the left side
        mergeSort(left);

        // sort the right side
        mergeSort(right);

        // merge the sorted left and right sides together
        merge(left, right, arr);
    }

    public void merge(int[] left, int[] right, int[] arr) {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            //original index
            k++;
        }
        if (i == left.length) {

            while (j < right.length) {
                arr[k] = right[j];
                k++;
                j++;
            }

        } else {
            while (i < left.length) {
                arr[k] = left[i];
                k++;
                i++;
            }
        }
    }

}

