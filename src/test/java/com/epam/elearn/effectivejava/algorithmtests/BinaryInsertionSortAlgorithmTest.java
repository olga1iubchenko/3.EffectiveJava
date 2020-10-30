package com.epam.elearn.effectivejava.algorithmtests;

import com.epam.elearn.effectivejava.BinaryInsertionSortAlgorithm;
import com.epam.elearn.effectivejava.InsertionSortAlgorithm;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinaryInsertionSortAlgorithmTest {

    private BinaryInsertionSortAlgorithm binaryInsertionSortAlgorithm;
    private static final int[] UNSUCCESSFUL = new int[0];
    private int[] oneElementArray = {5};;
    private int[] inputArray = {2, 5, 1, 7, 9, 12, 95, 3, 24, 33, 30};
    private int[] sortedInputArray = {1, 2, 3, 5, 7, 9, 12, 24, 30, 33, 95};

    @BeforeEach
    public void setUp() {
        binaryInsertionSortAlgorithm = new BinaryInsertionSortAlgorithm();
    }

    @Test
    public void testShouldReturnUnsuccessfulOnEmptyArray() {
        assertArrayEquals(UNSUCCESSFUL, binaryInsertionSortAlgorithm.binaryInsertionSort(new int[0]));
    }

    @Test
    public void testShouldReturnAnArrayWithOneElement() {
        assertEquals(oneElementArray, binaryInsertionSortAlgorithm.binaryInsertionSort(oneElementArray));
    }

    @Test
    public void testShouldReturnSortedArrayWithEvenNumberOfElements() {
        assertArrayEquals(sortedInputArray, binaryInsertionSortAlgorithm.binaryInsertionSort(inputArray));
    }

}
