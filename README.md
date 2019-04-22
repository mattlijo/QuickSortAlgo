QuickSort
QuickSort is a sorting algorithm developed by Tony Hoare that, on average, makes O(n log n) comparisons to sort n items. It is also known as partition-exchange sort because of its use of the partition algorithm. In the worst case, it makes O(n2) comparisons, though this behaviour is rare. QuickSort is often faster in practice than other O(n log n) algorithms.

Partition Algorithm
We know that QuickSort relies on partitioning as a key step in its algorithm, but what does that really mean? 
Once you've read the annotated code for partition it's relatively easy to see what it's doing. Given an array and a pivot point, the algorithm swaps elements in the array such that all elements in the array that are less than the original pivot value come before it and all elements that are greater than the original pivot value come after it.
There are a couple different ways to implement partitioning. The implementation provided above is your teacher's favourite because it's performed in place (does not require another array) and requires only O(log n) space.

1) Quicksort with middle pivot

2) Quicksort with last entry as pivot.
	2.1) Ascending order
	2.2) Descending order
