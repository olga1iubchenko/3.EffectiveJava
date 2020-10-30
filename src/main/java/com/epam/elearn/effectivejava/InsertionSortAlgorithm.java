package com.epam.elearn.effectivejava;

public class InsertionSortAlgorithm {

    public int[] insertionSort(int[] array) {
        int i, j, key, temp;
        for (i = 1; i < array.length; i++) {
            key = array[i];
            j = i - 1;
            while ( j >= 0 && key < array[j]) {
                temp = array[j];
                array[j] = array[j+1];
                array[j+1] = temp;
                j--;
            }
        }
        return array;
    }
}
