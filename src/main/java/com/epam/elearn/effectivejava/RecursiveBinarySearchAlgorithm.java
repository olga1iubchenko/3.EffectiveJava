package com.epam.elearn.effectivejava;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RecursiveBinarySearchAlgorithm {
    // Returns index of x if it is present in arr[l..
    // r], else return -1
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


    // Driver method to test above
//    public static void main(String args[])
//    {
//        RecursiveBinarySearchAlgorithm ob = new RecursiveBinarySearchAlgorithm();
//        int arr[] = { 2, 3, 4, 10, 40 };
//        int n = arr.length;
//        int x = 10;
//        int result = ob.binarySearch(arr, 0, n - 1, x);
//        if (result == -1)
//            System.out.println("Element not present");
//        else
//            System.out.println("Element found at index " + result);
//    }
}
