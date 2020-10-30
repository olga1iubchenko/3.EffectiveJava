package com.epam.elearn.effectivejava;


import com.epam.elearn.effectivejava.IterativeBinarySearchAlgorithm;
import com.epam.elearn.effectivejava.MergeSortAlgorithm;
import com.epam.elearn.effectivejava.RecursiveBinarySearchAlgorithm;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;

import java.nio.charset.Charset;
import java.util.concurrent.TimeUnit;

public class BenchMark {

//    @State(Scope.Benchmark)
//    public static class Log {
//        public int x = 8;
//    }

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

//    @Fork(value = 1, warmups = 1)
//    @Benchmark
//    @BenchmarkMode(Mode.Throughput)
//    @Warmup(iterations = 5)
//    public void benchMurmur3_128(ExecutionPlan plan) {
//
//        for (int i = plan.iterations; i > 0; i--) {
//            plan.murmur3.putString(plan.password, Charset.defaultCharset());
//        }
//
//        plan.murmur3.hash();
//    }
//
//    @Benchmark
//    @Fork(value = 1, warmups = 1)
//    @BenchmarkMode(Mode.Throughput)
//    public void init() {
//        // Do nothing
//    }

//    @Fork(value = 1, warmups = 1)
//    @Benchmark
//    @OutputTimeUnit(TimeUnit.NANOSECONDS)
//    @BenchmarkMode(Mode.AverageTime)
//    @Warmup(iterations = 5)
//    public void testIterativeBinarySearchBenchmark(ExecutionPlan executionPlan) {
//        executionPlan.iterativeBinarySearchAlgorithm.iterativeBinarySearch(new int[]{1, 2, 4, 7, 8, 12, 15, 19, 24, 50, 69, 80, 100}, 100);
//    }
//
//    @Fork(value = 1, warmups = 1)
//    @Benchmark
//    @OutputTimeUnit(TimeUnit.NANOSECONDS)
//    @BenchmarkMode(Mode.AverageTime)
//    @Warmup(iterations = 5)
//    public void testRecursiveBinarySearchBenchmark(ExecutionPlan executionPlan) {
//        executionPlan.recursiveBinarySearchAlgorithm.recursiveBinarySearch(new int[]{1, 2, 4, 7, 8, 12, 15, 19, 24, 50, 69, 80, 100}, 100, 0, 13);
//    }
//
//    @Fork(value = 1, warmups = 1)
//    @Benchmark
//    @OutputTimeUnit(TimeUnit.NANOSECONDS)
//    @BenchmarkMode(Mode.AverageTime)
//    @Warmup(iterations = 5)
//    public void testMergeSortBenchmark(ExecutionPlan executionPlan) {
//        executionPlan.mergeSortAlgorithm.mergeSort(new int[]{1, 2, 4, 100, 8, 12, 15, 19, 24, 50, 12, 80, 11});
//    }

    @Fork(value = 1, warmups = 1)
    @Benchmark
    @OutputTimeUnit(TimeUnit.NANOSECONDS)
    @BenchmarkMode(Mode.AverageTime)
    @Warmup(iterations = 5)
    public void testInsertionSortBenchmark(ExecutionPlan executionPlan) {
        executionPlan.insertionSortAlgorithm.insertionSort(new int[]{1, 2, 4, 100, 8, 12, 15, 19, 24, 50, 12, 80, 11});
    }

    @Fork(value = 1, warmups = 1)
    @Benchmark
    @OutputTimeUnit(TimeUnit.NANOSECONDS)
    @BenchmarkMode(Mode.AverageTime)
    @Warmup(iterations = 5)
    public void testBinaryInsertionSortBenchmark(ExecutionPlan executionPlan) {
        executionPlan.binaryInsertionSortAlgorithm.binaryInsertionSort(new int[]{1, 2, 4, 100, 8, 12, 15, 19, 24, 50, 12, 80, 11});
    }




//    @Benchmark
//    @OutputTimeUnit(TimeUnit.NANOSECONDS)
//    @BenchmarkMode(Mode.AverageTime)
//    public void objectCreation() {
//        new Object();
//    }
//
//    @Benchmark
//    @OutputTimeUnit(TimeUnit.NANOSECONDS)
//    @BenchmarkMode(Mode.AverageTime)
//    public Object pillarsOfCreation() {
//        return new Object();
//    }
//
//    @Benchmark
//    @OutputTimeUnit(TimeUnit.NANOSECONDS)
//    @BenchmarkMode(Mode.AverageTime)
//    public void blackHole(Blackhole blackhole) {
//        blackhole.consume(new Object());
//    }
//
//    @Benchmark
//    public double foldedLog() {
//        int x = 8;
//
//        return Math.log(x);
//    }
//
//    @Benchmark
//    public double log(Log input) {
//        return Math.log(input.x);
//    }

}
