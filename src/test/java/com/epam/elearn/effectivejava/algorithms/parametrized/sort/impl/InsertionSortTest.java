package com.epam.elearn.effectivejava.algorithms.parametrized.sort.impl;

import com.epam.elearn.effectivejava.algorithms.InsertionSortAlgorithm;
import com.epam.elearn.effectivejava.algorithms.parametrized.sort.SortingAlgorithmAggregatorTest;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class InsertionSortTest extends SortingAlgorithmAggregatorTest {
    public InsertionSortTest() { super(new InsertionSortAlgorithm());}
}
