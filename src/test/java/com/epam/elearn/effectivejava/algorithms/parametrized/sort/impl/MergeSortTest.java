package com.epam.elearn.effectivejava.algorithms.parametrized.sort.impl;

import com.epam.elearn.effectivejava.algorithms.MergeSortAlgorithm;
import com.epam.elearn.effectivejava.algorithms.parametrized.sort.SortingAlgorithmAggregatorTest;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class MergeSortTest extends SortingAlgorithmAggregatorTest {
    public MergeSortTest() { super(new MergeSortAlgorithm());}
}
