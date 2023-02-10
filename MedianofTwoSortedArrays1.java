package org.example;

public class MedianofTwoSortedArrays1 {
    public double solution (int[] array1, int[] array2){
        int i = 0, j = 0, k = 0;
        int [] temp = new int[];
        while ( i <= array1.length-1 && j <= array2.length-1){
            if (array1[i] < array2[j]){
                temp[k] = array1[i];
                k++;
                i++;
            }
            else {
                temp[k] = array2[j];
                k++;
                j++;
            }
        }
        while ( i >= array1.length){
            temp[k] = array2[j];
            k++;
            j++;
        }
        while ( j >= array2.length){
            temp[k] = array1[i];
            k++;
            i++;
        }
        double ans = 0;
        if (temp.length %2 == 1){
            ans = temp[temp.length/2];
        }
        else {
            ans = (temp[temp.length/2] + temp[temp.length/2 -1])/2;
        }
        return ans;
    }
}
