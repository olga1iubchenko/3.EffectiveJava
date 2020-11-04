BINARY SEARCH: RECURSIVE VS ITERATIVE:

Considering these two approaches to implement binary search algorithm both will have the same time complexity O(log(n)), 
but they will different in term of space usage.
Recursive may reach to "log(n)" space (because of the stack), in iterative BS it should be "O(1)" space complexity.

Please find the benchmark tests results below:

ITERATIVE:
Benchmark                                     (iterations)  Mode  Cnt   Score   Error  Units
BenchMark.testIterativeBinarySearchBenchmark             1  avgt   20  41.145 ± 0.669  ns/op
BenchMark.testIterativeBinarySearchBenchmark             2  avgt   20  41.382 ± 2.224  ns/op
BenchMark.testIterativeBinarySearchBenchmark             3  avgt   20  43.894 ± 2.673  ns/op
BenchMark.testIterativeBinarySearchBenchmark             4  avgt   20  40.027 ± 1.193  ns/op
BenchMark.testIterativeBinarySearchBenchmark             5  avgt   20  39.814 ± 1.272  ns/op
BenchMark.testIterativeBinarySearchBenchmark             6  avgt   20  40.524 ± 2.611  ns/op
BenchMark.testIterativeBinarySearchBenchmark             7  avgt   20  39.923 ± 0.964  ns/op
BenchMark.testIterativeBinarySearchBenchmark             8  avgt   20  39.459 ± 0.814  ns/op
BenchMark.testIterativeBinarySearchBenchmark             9  avgt   20  41.443 ± 2.478  ns/op
BenchMark.testIterativeBinarySearchBenchmark            10  avgt   20  41.884 ± 2.457  ns/op

RECURSION:
Benchmark                                     (iterations)  Mode  Cnt   Score   Error  Units
BenchMark.testRecursiveBinarySearchBenchmark             1  avgt   20  37.574 ± 1.230  ns/op
BenchMark.testRecursiveBinarySearchBenchmark             2  avgt   20  40.534 ± 2.999  ns/op
BenchMark.testRecursiveBinarySearchBenchmark             3  avgt   20  48.501 ± 6.650  ns/op
BenchMark.testRecursiveBinarySearchBenchmark             4  avgt   20  38.697 ± 1.751  ns/op
BenchMark.testRecursiveBinarySearchBenchmark             5  avgt   20  38.762 ± 1.315  ns/op
BenchMark.testRecursiveBinarySearchBenchmark             6  avgt   20  40.440 ± 3.407  ns/op
BenchMark.testRecursiveBinarySearchBenchmark             7  avgt   20  39.749 ± 4.169  ns/op
BenchMark.testRecursiveBinarySearchBenchmark             8  avgt   20  39.106 ± 2.117  ns/op
BenchMark.testRecursiveBinarySearchBenchmark             9  avgt   20  37.736 ± 1.249  ns/op
BenchMark.testRecursiveBinarySearchBenchmark            10  avgt   20  43.222 ± 2.937  ns/op

At the point of choice of recursive vs. iterative formulation is pretty much a matter of personal and local preference.
 
 But still here are a few points we should be aware of:

1. Recursion can be slower due to the overhead of maintaining a stack and usually takes up more memory
2. Recursion is not stack-friendly. It may cause StackOverflowException when processing big data sets
3. Recursion adds clarity to the code as it makes it shorter in comparison to the iterative approach

Ideally, a binary search will perform less number of comparisons in contrast to a linear search for large values of n. For smaller values of n, the linear search could perform better than a binary search.

One should know that this analysis is theoretical and might vary depending on the context.

Also, the binary search algorithm needs a sorted data set which has its costs too. If we use a merge sort algorithm for sorting the data, an additional complexity of n log n is added to our code.

So first we need to analyze our requirements well and then take a decision on which search algorithm would suit our requirements best.

MERGE SORT:

Benchmark Tests Results:
Benchmark                         (iterations)  Mode  Cnt   Score   Error  Units
BenchMark.testMergeSortBenchmark             1  avgt   20  49.071 ± 9.256  ns/op
BenchMark.testMergeSortBenchmark             2  avgt   20  49.289 ± 7.935  ns/op
BenchMark.testMergeSortBenchmark             3  avgt   20  34.316 ± 1.220  ns/op
BenchMark.testMergeSortBenchmark             4  avgt   20  33.655 ± 1.558  ns/op
BenchMark.testMergeSortBenchmark             5  avgt   20  36.273 ± 3.384  ns/op
BenchMark.testMergeSortBenchmark             6  avgt   20  45.730 ± 7.574  ns/op
BenchMark.testMergeSortBenchmark             7  avgt   20  42.460 ± 2.861  ns/op
BenchMark.testMergeSortBenchmark             8  avgt   20  35.830 ± 2.451  ns/op
BenchMark.testMergeSortBenchmark             9  avgt   20  36.335 ± 3.782  ns/op
BenchMark.testMergeSortBenchmark            10  avgt   20  36.958 ± 3.590  ns/op

As merge sort is a recursive algorithm, the time complexity can be expressed as the following recursive relation:

T(n) = 2T(n/2) + O(n)
2T(n/2) corresponds to the time required to sort the sub-arrays and O(n) time to merge the entire array.
When solved, the time complexity will come to O(nLogn).

This is true for the worst, average and best case since it will always divide the array into two and then merge.

The space complexity of the algorithm is O(n) as we're creating temporary arrays in every recursive call.

INSERTION SORT:

Benchmark Test Results: 

Benchmark                             (iterations)  Mode  Cnt   Score    Error  Units
BenchMark.testInsertionSortBenchmark             1  avgt   20  62.620 ±  7.976  ns/op
BenchMark.testInsertionSortBenchmark             2  avgt   20  56.022 ±  7.988  ns/op
BenchMark.testInsertionSortBenchmark             3  avgt   20  65.537 ± 14.769  ns/op
BenchMark.testInsertionSortBenchmark             4  avgt   20  63.561 ±  8.992  ns/op
BenchMark.testInsertionSortBenchmark             5  avgt   20  53.806 ±  1.880  ns/op
BenchMark.testInsertionSortBenchmark             6  avgt   20  55.936 ±  3.482  ns/op
BenchMark.testInsertionSortBenchmark             7  avgt   20  53.317 ±  1.779  ns/op
BenchMark.testInsertionSortBenchmark             8  avgt   20  61.765 ± 10.414  ns/op
BenchMark.testInsertionSortBenchmark             9  avgt   20  60.906 ±  8.225  ns/op
BenchMark.testInsertionSortBenchmark            10  avgt   20  58.046 ±  5.080  ns/op

Time Complexity O(n*2) ans Space Complexity O(1)

Insertion sort takes maximum time to sort if elements are sorted in reverse order. And it takes minimum time (Order of n) when elements are already sorted.

Insertion sort is used when number of elements is small. It can also be useful when input array is almost sorted, only few elements are misplaced in complete big array.

BINARY INSERTION SORT:

Benchmark Test Results: 
Benchmark                                   (iterations)  Mode  Cnt    Score    Error  Units
BenchMark.testBinaryInsertionSortBenchmark             1  avgt   20  151.825 ± 10.268  ns/op
BenchMark.testBinaryInsertionSortBenchmark             2  avgt   20  165.125 ± 19.457  ns/op
BenchMark.testBinaryInsertionSortBenchmark             3  avgt   20  162.108 ± 15.953  ns/op
BenchMark.testBinaryInsertionSortBenchmark             4  avgt   20  171.789 ± 26.856  ns/op
BenchMark.testBinaryInsertionSortBenchmark             5  avgt   20  178.858 ± 22.212  ns/op
BenchMark.testBinaryInsertionSortBenchmark             6  avgt   20  172.422 ± 17.742  ns/op
BenchMark.testBinaryInsertionSortBenchmark             7  avgt   20  187.192 ± 41.445  ns/op
BenchMark.testBinaryInsertionSortBenchmark             8  avgt   20  198.093 ± 62.848  ns/op
BenchMark.testBinaryInsertionSortBenchmark             9  avgt   20  167.952 ± 20.599  ns/op
BenchMark.testBinaryInsertionSortBenchmark            10  avgt   20  157.919 ±  8.323  ns/op

We can use binary search to reduce the number of comparisons in normal insertion sort. Binary Insertion Sort uses binary search to find the proper location to insert the selected item at each iteration. 
In normal insertion sort, it takes O(n) comparisons (at nth iteration) in the worst case. We can reduce it to O(log n) by using binary search.
