package com.epam.elearn.effectivejava;

public class MergeSortAlgorithm {
//        public static void main(String[] args) {
//            int[] evenInputArray = {2, 5, 1, 7, 9, 12, 95, 3, 24, 33};
//            mergeSort(evenInputArray);
//            for (int i = 0; i < evenInputArray.length; i++)
//                System.out.println(evenInputArray[i]);
//        }

//    public static void mergeSort(int[] a, int n) {
//        if (n < 2)
//            return;
//        int mid = n / 2;
//        int[] l = new int[mid];
//        int[] r = new int[n - mid];
//
//        for (int i = 0; i < mid; i++) {
//            l[i] = a[i];
//        }
//        for (int i = mid; i < n; i++) {
//            r[i - mid] = a[i];
//        }
//        mergeSort(l, mid);
//        mergeSort(r, n - mid);
//        merge(a, l, r, mid, n - mid);
//    }
//
//    public static void merge(int[] a, int[] l, int[] r, int left, int right) {
//
//        int i = 0, j = 0, k = 0;
//
//        while (i < left && j < right) {
//
//            if (l[i] <= r[j])
//                a[k++] = l[i++];
//            else
//                a[k++] = r[j++];
//
//        }
//
//        while (i < left)
//            a[k++] = l[i++];
//
//        while (j < right)
//            a[k++] = r[j++];
//    }

        public static int[] mergeSort(int[] array) {
            if ( array.length <= 1) {
                return array;
            }
            int midpoint = array.length / 2;
            int[] left = new int[midpoint];
            int[] right;

            if(array.length % 2 == 0) {
                right = new int[midpoint];
            } else { right = new int[midpoint + 1];}

            for (int i = 0; i < midpoint; i ++) {
                left[i] = array[i];
            }
            for (int j = 0; j < right.length; j++){
                right[j] = array[midpoint + j];
            }

            int[] result;
            left = mergeSort(left);
            right = mergeSort(right);
            result = merge(left, right);

            return result;
        }

        private static int[] merge(int[] left, int[] right) {

            int[] result = new int[left.length + right.length];
            int leftPointer, rightPointer, resultPointer;
            leftPointer = rightPointer = resultPointer = 0;

            while (leftPointer < left.length || rightPointer < right.length) {
                if (leftPointer < left.length && rightPointer < right.length) {
                    if (left[leftPointer] < right[rightPointer]) {
                       result[resultPointer++] = left[leftPointer++];
                    } else {
                        result[resultPointer++] = right[rightPointer++];
                    }
                } else if ( leftPointer < left.length) {
                    result[resultPointer++] = left[leftPointer++];
                } else if (rightPointer < right.length) {
                    result[resultPointer++] = right[rightPointer++];
                }
            }
            return result;
        }

}
