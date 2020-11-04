package com.epam.elearn.effectivejava.algorithms.parametrized.sort;

import com.epam.elearn.effectivejava.algorithms.IterativeBinarySearchAlgorithm;
import com.epam.elearn.effectivejava.algorithms.Sortable;
import org.junit.Before;
import org.junit.Test;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public abstract class SortingAlgorithmAggregatorTest {
    @Parameterized.Parameters
    public static List<Object[]> data() {
        List<Object[]> data = new ArrayList<>();
        data.add(new Object[]{new int[]{}, -1});
        data.add(new Object[]{new int[]{5}, new int[]{5}});
        data.add(new Object[]{new int[]{1, 2, 4, 7, 8, 12, 15, 19, 24, 50, 69, 80, 100}, new int[]{1, 2, 3, 5, 7, 9, 12, 24, 33, 95}});
        data.add(new Object[]{new int[]{2, 5, 1, 7, 9, 12, 95, 3, 24, 33, 30}, new int[]{1, 2, 3, 5, 7, 9, 12, 24, 30, 33, 95}});
        return data;
    }

    @Parameterized.Parameter(0)
    public int[] inputArray;

    @Parameterized.Parameter(1)
    public int[] expected;

    Sortable sortable;

    public SortingAlgorithmAggregatorTest (Sortable sortable) {
        this.sortable = sortable;
    }
    
    @Test
    public void test() {
        int[] actual = sortable.sort(inputArray);
        assertArrayEquals(expected, actual);
    }
}
