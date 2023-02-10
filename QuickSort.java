package org.example;

public class QuickSort {
    public void quickSort (int[] array, int start, int end){
        int pivot = partition(array,start,end);
        quickSort(array, start, pivot-1);
        quickSort(array, pivot+1, end);
    }
    public int partition (int[] array, int start, int end){
        int j = start -1;
        for (int i = start; i <= end; i++){
            if (array[i] < array[end]){
                j++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        return j;
    }
}
