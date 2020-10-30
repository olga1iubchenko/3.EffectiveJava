package com.epam.elearn.effectivejava.algorithmtests;


import com.epam.elearn.effectivejava.IterativeBinarySearchAlgorithm;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class IterativeBinarySearchAlgorithmTest {

    private IterativeBinarySearchAlgorithm iterativeBinarySearchAlgorithm;
    private static final int UNSUCCESSFUL = -1;
    private int[] sortedArray = {1, 2, 4, 7, 8, 12, 15, 19, 24, 50, 69, 80, 100};

    @BeforeEach
    public void setUp() {
        iterativeBinarySearchAlgorithm = new IterativeBinarySearchAlgorithm();
    }

    @Test
    public void testShouldReturnUnsuccessfulOnEmptyArray() {
        assertEquals(UNSUCCESSFUL, iterativeBinarySearchAlgorithm.iterativeBinarySearch(new int[]{}, 0));
    }

    @Test
    public void testShouldReturnUnsuccessfulOnLeftBound() {
        assertEquals(UNSUCCESSFUL, iterativeBinarySearchAlgorithm.iterativeBinarySearch(sortedArray, 0));
    }

    @Test
    public void testShouldReturnUnsuccessfulOnRightBound() {
        assertEquals(UNSUCCESSFUL, iterativeBinarySearchAlgorithm.iterativeBinarySearch(sortedArray, 101));
    }

    @Test
    public void testShouldReturnSuccessfulOnLeftBound() {
        assertEquals(0, iterativeBinarySearchAlgorithm.iterativeBinarySearch(sortedArray, 1));
    }

    @Test
    public void testShouldReturnSuccessfulOnRightBound() {
        assertEquals(12, iterativeBinarySearchAlgorithm.iterativeBinarySearch(sortedArray, 100));
    }

    @Test
    public void testShouldReturnSuccessfulOnMid() {
        assertEquals(7, iterativeBinarySearchAlgorithm.iterativeBinarySearch(sortedArray, 19));
    }

    @Test
    public void testShouldReturnSuccessfulOnMidGreaterThanGivenNumber() {
        assertEquals(5, iterativeBinarySearchAlgorithm.iterativeBinarySearch(sortedArray, 12));
    }

    @Test
    public void testShouldReturnSuccessfulOnMidLesserThanGivenNumber() {
        assertEquals(10, iterativeBinarySearchAlgorithm.iterativeBinarySearch(sortedArray, 69));
    }
}
