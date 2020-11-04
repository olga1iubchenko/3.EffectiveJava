package com.epam.elearn.effectivejava.algorithms;

public class IterativeBinarySearchAlgorithm {

    public int iterativeBinarySearch(int[] sortedArray, int target) {
        if(sortedArray == null || sortedArray.length == 0) return -1;
        int start = 0, end = sortedArray.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (sortedArray[mid] == target)
                return mid;
            if (sortedArray[mid] > target)
                end = mid - 1;
            else
                start = mid + 1;
        }
        return -1;
    }
}
