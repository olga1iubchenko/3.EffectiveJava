package com.epam.elearn.effectivejava;

import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;

import java.util.concurrent.TimeUnit;


public class IterativeBinarySearchAlgorithm {
    // Returns index of x if it is present in arr[],
    // else return -1

    public int iterativeBinarySearch(int[] sortedArray, int target) {
        if(sortedArray == null || sortedArray.length == 0) return -1;
        int start = 0, end = sortedArray.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // Check if x is present at mid
            if (sortedArray[mid] == target)
                return mid;
            // If key greater, ignore left half
            if (sortedArray[mid] > target)
                end = mid - 1;
                // If x is smaller, ignore right half
            else
                start = mid + 1;
        }
        // if we reach here, then element was
        // not present
        return -1;
    }
}
