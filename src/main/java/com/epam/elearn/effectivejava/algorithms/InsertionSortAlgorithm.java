package com.epam.elearn.effectivejava.algorithms;

public class InsertionSortAlgorithm implements Sortable{

    public int[] sort (int[] array) {
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
