package com.epam.elearn.effectivejava.algorithms;

public class RecursiveBinarySearchAlgorithm {

    public int recursiveBinarySearch(int[] sortedArray, int target, int start, int end) {
        if( sortedArray == null || sortedArray.length == 0 || start > end ) return -1;
        int middle = start + (end - start) / 2;
        if (target == sortedArray[middle]) {
            return middle;
        } else if (target < sortedArray[middle]) {
            return recursiveBinarySearch(sortedArray, target, start, middle - 1);
        } else {
            return recursiveBinarySearch(sortedArray, target, middle + 1, end);
        }
    }
}
