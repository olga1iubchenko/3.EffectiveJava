package com.epam.elearn.effectivejava.algorithmtests;


import com.epam.elearn.effectivejava.RecursiveBinarySearchAlgorithm;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class RecursiveBinarySearchAlgorithmTest {

    private RecursiveBinarySearchAlgorithm recursiveBinarySearchAlgorithm;
    private static final int UNSUCCESSFUL = -1;
    int[] sortedArray = { 1, 2, 4, 7, 8, 12, 15, 19, 24, 50, 69, 80, 100 };

    @BeforeEach
    public void setUp() throws Exception {
        recursiveBinarySearchAlgorithm = new RecursiveBinarySearchAlgorithm();
    }

    @Test
    public void testShouldReturnUnsuccessfulOnEmptyArray() {
        assertEquals(UNSUCCESSFUL, recursiveBinarySearchAlgorithm.recursiveBinarySearch(new int[]{}, 0, 0, 0));
    }

    @Test
    public void testShouldReturnUnsuccessfulOnLeftBound() {
        assertEquals(UNSUCCESSFUL, recursiveBinarySearchAlgorithm.recursiveBinarySearch(sortedArray, 0, 0,13));
    }

    @Test
    public void testShouldReturnUnsuccessfulOnRightBound() {
        assertEquals(UNSUCCESSFUL, recursiveBinarySearchAlgorithm.recursiveBinarySearch(sortedArray, 0,0, 14));
    }

    @Test
    public void testShouldReturnSuccessfulOnLeftBound() {
        assertEquals(0, recursiveBinarySearchAlgorithm.recursiveBinarySearch(sortedArray, 1, 0, 13));
    }

    @Test
    public void testShouldReturnSuccessfulOnRightBound() {
        assertEquals(12, recursiveBinarySearchAlgorithm.recursiveBinarySearch(sortedArray, 100, 0, 13));
    }

    @Test
    public void testShouldReturnSuccessfulOnMid() {
        assertEquals(7, recursiveBinarySearchAlgorithm.recursiveBinarySearch(sortedArray, 19, 0, 13));
    }

    @Test
    public void testShouldReturnSuccessfulOnMidGreaterThanGivenNumber() {
        assertEquals(5, recursiveBinarySearchAlgorithm.recursiveBinarySearch(sortedArray, 12, 0,13));
    }

    @Test
    public void testShouldReturnSuccessfulOnMidLesserThanGivenNumber() {
        assertEquals(10, recursiveBinarySearchAlgorithm.recursiveBinarySearch(sortedArray, 69, 0, 13));
    }

}
