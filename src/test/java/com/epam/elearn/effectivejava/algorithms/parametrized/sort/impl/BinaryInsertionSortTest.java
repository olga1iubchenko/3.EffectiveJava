package com.epam.elearn.effectivejava.algorithms.parametrized.sort.impl;

import com.epam.elearn.effectivejava.algorithms.BinaryInsertionSortAlgorithm;
import com.epam.elearn.effectivejava.algorithms.parametrized.sort.SortingAlgorithmAggregatorTest;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class BinaryInsertionSortTest extends SortingAlgorithmAggregatorTest {
    public BinaryInsertionSortTest() { super(new BinaryInsertionSortAlgorithm());}
}
