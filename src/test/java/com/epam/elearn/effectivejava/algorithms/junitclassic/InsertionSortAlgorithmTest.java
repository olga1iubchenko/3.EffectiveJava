package com.epam.elearn.effectivejava.algorithms.junitclassic;

import com.epam.elearn.effectivejava.algorithms.InsertionSortAlgorithm;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class InsertionSortAlgorithmTest {

    private InsertionSortAlgorithm insertionSortAlgorithm;
    private static final int[] UNSUCCESSFUL = new int[0];
    private int[] oneElementArray = {5};
    private int[] inputArray = {2, 5, 1, 7, 9, 12, 95, 3, 24, 33, 30};
    private int[] sortedInputArray = {1, 2, 3, 5, 7, 9, 12, 24, 30, 33, 95};

    @BeforeEach
    public void setUp() {
        insertionSortAlgorithm = new InsertionSortAlgorithm();
    }

    @Test
    public void testShouldReturnUnsuccessfulOnEmptyArray() {
        assertArrayEquals(UNSUCCESSFUL, insertionSortAlgorithm.sort(new int[0]));
    }

    @Test
    public void testShouldReturnAnArrayWithOneElement() {
        assertEquals(oneElementArray, insertionSortAlgorithm.sort(oneElementArray));
    }

    @Test
    public void testShouldReturnSortedArrayWithEvenNumberOfElements() {
        assertArrayEquals(sortedInputArray, insertionSortAlgorithm.sort(inputArray));
    }

}
