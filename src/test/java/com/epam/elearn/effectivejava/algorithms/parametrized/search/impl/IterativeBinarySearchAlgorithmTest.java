package com.epam.elearn.effectivejava.algorithms.parametrized.search.impl;

import com.epam.elearn.effectivejava.algorithms.IterativeBinarySearchAlgorithm;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class IterativeBinarySearchAlgorithmTest {

    @Parameterized.Parameters
    public static List<Object[]> data() {
        List<Object[]> data = new ArrayList<>();
        data.add(new Object[]{new int[]{}, 0, -1});
        data.add(new Object[]{new int[]{1, 2, 4, 7, 8, 12, 15, 19, 24, 50, 69, 80, 100}, 0, -1});
        data.add(new Object[]{new int[]{1, 2, 4, 7, 8, 12, 15, 19, 24, 50, 69, 80, 100}, 101, -1});
        data.add(new Object[]{new int[]{1, 2, 4, 7, 8, 12, 15, 19, 24, 50, 69, 80, 100}, 1, 0});
        data.add(new Object[]{new int[]{1, 2, 4, 7, 8, 12, 15, 19, 24, 50, 69, 80, 100}, 100, 12});
        data.add(new Object[]{new int[]{1, 2, 4, 7, 8, 12, 15, 19, 24, 50, 69, 80, 100}, 19, 7});
        data.add(new Object[]{new int[]{1, 2, 4, 7, 8, 12, 15, 19, 24, 50, 69, 80, 100}, 12, 5});
        data.add(new Object[]{new int[]{1, 2, 4, 7, 8, 12, 15, 19, 24, 50, 69, 80, 100}, 69, 10});
        return data;
    }

    @Parameterized.Parameter(0)
    public int[] inputArray;

    @Parameterized.Parameter(1)
    public int target;

    @Parameterized.Parameter(2)
    public int expected;

    IterativeBinarySearchAlgorithm iterativeBinarySearchAlgorithm;

    @Before
    public void initialize() {
    iterativeBinarySearchAlgorithm = new IterativeBinarySearchAlgorithm(); }

    @Test
    public void test() {
        int actual = iterativeBinarySearchAlgorithm.iterativeBinarySearch(inputArray, target);
        assertEquals(expected,actual);
    }
}
