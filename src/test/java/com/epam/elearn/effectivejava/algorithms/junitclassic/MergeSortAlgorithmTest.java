package com.epam.elearn.effectivejava.algorithms.junitclassic;

import com.epam.elearn.effectivejava.algorithms.MergeSortAlgorithm;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MergeSortAlgorithmTest {

    private MergeSortAlgorithm mergeSortAlgorithm;
    private static final int[] UNSUCCESSFUL = new int[0];
    private int[] oneElementArray = {5};
    private int[] evenInputArray = {2, 5, 1, 7, 9, 12, 95, 3, 24, 33};
    private int[] sortedEvenInputArray = {1, 2, 3, 5, 7, 9, 12, 24, 33, 95};
    private int[] oddInputArray = {2, 5, 1, 7, 9, 12, 95, 3, 24, 33, 30};
    private int[] sortedOddInputArray = {1, 2, 3, 5, 7, 9, 12, 24, 30, 33, 95};

    @BeforeEach
    public void setUp() {
        mergeSortAlgorithm = new MergeSortAlgorithm();
    }

    @Test
    public void testShouldReturnUnsuccessfulOnEmptyArray() {
        assertArrayEquals(UNSUCCESSFUL, mergeSortAlgorithm.sort(new int[0]));
    }

    @Test
    public void testShouldReturnAnArrayWithOneElement() {
        assertEquals(oneElementArray, mergeSortAlgorithm.sort(oneElementArray));
    }

    @Test
    public void testShouldReturnSortedArrayWithEvenNumberOfElements() {
        assertArrayEquals(sortedEvenInputArray, mergeSortAlgorithm.sort(evenInputArray));
    }

    @Test
    public void testShouldSortedArrayWithOddNumberOfElements() {
        assertArrayEquals(sortedOddInputArray, mergeSortAlgorithm.sort(oddInputArray));
    }
}
