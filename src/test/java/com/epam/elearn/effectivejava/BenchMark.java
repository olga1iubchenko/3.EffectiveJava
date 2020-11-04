package com.epam.elearn.effectivejava;

import com.epam.elearn.effectivejava.algorithms.*;
import org.openjdk.jmh.annotations.*;
import java.util.concurrent.TimeUnit;

public class BenchMark {

    @State(Scope.Benchmark)
    public static class ExecutionPlan {

        @Param({"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"})
        public int iterations;

        private IterativeBinarySearchAlgorithm iterativeBinarySearchAlgorithm;
        private RecursiveBinarySearchAlgorithm recursiveBinarySearchAlgorithm;
        private MergeSortAlgorithm mergeSortAlgorithm;
        private InsertionSortAlgorithm insertionSortAlgorithm;
        private BinaryInsertionSortAlgorithm binaryInsertionSortAlgorithm;

        @Setup(Level.Invocation)
        public void setUp() {
            iterativeBinarySearchAlgorithm = new IterativeBinarySearchAlgorithm();
            recursiveBinarySearchAlgorithm = new RecursiveBinarySearchAlgorithm();
            mergeSortAlgorithm = new MergeSortAlgorithm();
            insertionSortAlgorithm = new InsertionSortAlgorithm();
            binaryInsertionSortAlgorithm = new BinaryInsertionSortAlgorithm();
        }
    }

    @Fork(value = 1, warmups = 1)
    @Benchmark
    @OutputTimeUnit(TimeUnit.NANOSECONDS)
    @BenchmarkMode(Mode.AverageTime)
    @Warmup(iterations = 5)
    public void testIterativeBinarySearchBenchmark(ExecutionPlan executionPlan) {
        executionPlan.iterativeBinarySearchAlgorithm.iterativeBinarySearch(new int[]{1, 2, 4, 7, 8, 12, 15, 19, 24, 50, 69, 80, 100}, 100);
    }

    @Fork(value = 1, warmups = 1)
    @Benchmark
    @OutputTimeUnit(TimeUnit.NANOSECONDS)
    @BenchmarkMode(Mode.AverageTime)
    @Warmup(iterations = 5)
    public void testRecursiveBinarySearchBenchmark(ExecutionPlan executionPlan) {
        executionPlan.recursiveBinarySearchAlgorithm.recursiveBinarySearch(new int[]{1, 2, 4, 7, 8, 12, 15, 19, 24, 50, 69, 80, 100}, 100, 0, 13);
    }

    @Fork(value = 1, warmups = 1)
    @Benchmark
    @OutputTimeUnit(TimeUnit.NANOSECONDS)
    @BenchmarkMode(Mode.AverageTime)
    @Warmup(iterations = 5)
    public void testMergeSortBenchmark(ExecutionPlan executionPlan) {
        executionPlan.mergeSortAlgorithm.sort(new int[]{1, 2, 4, 100, 8, 12, 15, 19, 24, 50, 12, 80, 11});
    }

    @Fork(value = 1, warmups = 1)
    @Benchmark
    @OutputTimeUnit(TimeUnit.NANOSECONDS)
    @BenchmarkMode(Mode.AverageTime)
    @Warmup(iterations = 5)
    public void testInsertionSortBenchmark(ExecutionPlan executionPlan) {
        executionPlan.insertionSortAlgorithm.sort(new int[]{1, 2, 4, 100, 8, 12, 15, 19, 24, 50, 12, 80, 11});
    }

    @Fork(value = 1, warmups = 1)
    @Benchmark
    @OutputTimeUnit(TimeUnit.NANOSECONDS)
    @BenchmarkMode(Mode.AverageTime)
    @Warmup(iterations = 5)
    public void testBinaryInsertionSortBenchmark(ExecutionPlan executionPlan) {
        executionPlan.binaryInsertionSortAlgorithm.sort(new int[]{1, 2, 4, 100, 8, 12, 15, 19, 24, 50, 12, 80, 11});
    }
}
