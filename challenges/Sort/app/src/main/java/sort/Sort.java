package sort;

import java.util.Arrays;

public class Sort {
    public void mergeSort(int[] arr){
        int length = arr.length;
        if(length<2)
            return;

       int mid = length/2;
       int[] left = Arrays.copyOfRange(arr,0,mid);
        int[] right = Arrays.copyOfRange(arr,mid,length-1);
        mergeSort(left);
        mergeSort(right);
        merge(arr,left,right);
    }
    public void merge(int[] arr,int[] left, int[] right ){
        int leftIndex=0, rightIndex=0, arrIndex=0;
        while(leftIndex< left.length && rightIndex<right.length){
            if(left[leftIndex]>right[rightIndex]){
                arr[arrIndex]= right[rightIndex];
                rightIndex++;
            }
            else{
                arr[arrIndex]= left[leftIndex];
                leftIndex++;
            }
            arrIndex++;
        }



    }
}
