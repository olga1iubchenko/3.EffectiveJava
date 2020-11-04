package com.epam.elearn.effectivejava.algorithms.parametrized.search.impl;

import com.epam.elearn.effectivejava.algorithms.RecursiveBinarySearchAlgorithm;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class RecursiveBinarySearchAlgorithmTest {

        @Parameterized.Parameters
        public static List<Object[]> data() {
            List<Object[]> data = new ArrayList<>();
            data.add(new Object[]{new int[]{}, 0, 0, 0, -1});
            data.add(new Object[]{new int[]{1, 2, 4, 7, 8, 12, 15, 19, 24, 50, 69, 80, 100}, 0, 0, 13, -1});
            data.add(new Object[]{new int[]{1, 2, 4, 7, 8, 12, 15, 19, 24, 50, 69, 80, 100}, 0,0, 14, -1});
            data.add(new Object[]{new int[]{1, 2, 4, 7, 8, 12, 15, 19, 24, 50, 69, 80, 100}, 1, 0, 13, 0});
            data.add(new Object[]{new int[]{1, 2, 4, 7, 8, 12, 15, 19, 24, 50, 69, 80, 100}, 100, 0, 13, 12});
            data.add(new Object[]{new int[]{1, 2, 4, 7, 8, 12, 15, 19, 24, 50, 69, 80, 100}, 19, 0, 13, 7});
            data.add(new Object[]{new int[]{1, 2, 4, 7, 8, 12, 15, 19, 24, 50, 69, 80, 100}, 12, 0, 13, 5});
            data.add(new Object[]{new int[]{1, 2, 4, 7, 8, 12, 15, 19, 24, 50, 69, 80, 100}, 69, 0, 13, 10});
            return data;
        }

        @Parameterized.Parameter(0)
        public int[] inputArray;

        @Parameterized.Parameter(1)
        public int target;

        @Parameterized.Parameter(2)
        public int start;

        @Parameterized.Parameter(3)
        public int end;

        @Parameterized.Parameter(4)
        public int expected;

        RecursiveBinarySearchAlgorithm recursiveBinarySearchAlgorithm;

        @Before
        public void initialize() {

            recursiveBinarySearchAlgorithm = new RecursiveBinarySearchAlgorithm(); }

        @Test
        public void test() {
            int actual = recursiveBinarySearchAlgorithm.recursiveBinarySearch(inputArray, target, start, end);
            assertEquals(expected,actual);
        }
}
