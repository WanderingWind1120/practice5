package org.example;

public class MedianofTwoSortedArrays {
    public double solution (int[] array1, int [] array2){
        int i = 0, j = 0, k = 0;
        double[] temp = new double[array1.length + array2.length];

        while (i <= array1.length - 1 && j <= array2.length - 1) {
            if (array1[i] < array2[j]){
                temp[k] = array1[i];
                i++;
                k++;
            } else if (array1[i] > array2[j]) {
                 temp[k] = array2[j];
                 k++;
                 j++;
            }
        }
        while (i >= array1.length){
            temp[k] = array1[i];
            k++;
            i++;
        }
        while (j >= array2.length){
            temp[k] = array2[j];
            k++;
            j++;
        }

        double ans = 0;
        if (temp.length %2 ==1 ){
            ans = temp[(int) temp.length/2];
        }
        else {
            ans = (temp[temp.length/2] + temp[temp.length/2 -1])/2;
        }
        return ans;
    }
}
