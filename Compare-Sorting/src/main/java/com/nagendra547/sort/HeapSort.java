package com.nagendra547.sort;

/**
 * 
 * @author nagendra
 * 
 *         <p>
 *         Heap is a complete Binary tree and can be represented as array of
 *         having elements with i=0 to i =n-1 where n is the size of array.
 *         MaxHeap - Root is the largest element in heap. MinHeap - Root is the
 *         smallest element in heap.
 *         </p>
 * 
 *         Each subtree is also a heap ( parent value largest than children for
 *         maxheap etc.)
 * 
 *         If parent index is i then Index of children are 2*i+1 and 2*i+2 (
 *         Consider i starts with 0) So parent of nth element is n/2-1. Maxmimum
 *         number of elements at each level 2 to power n. ( Consider first level
 *         as 0)
 * 
 * 
 *         Here is an array represented as complete binary tree having 6
 *         elements.
 * 
 *         0 1 2 3 4 5
 * 
 *         so Total elements count at nth level ( 2 to power(n-1))
 * 
 * 
 *         Consider a heap of elements as [12,45,67,33,22,99] and so initial
 *         structure
 * 
 *         12 45 67 33 22 99
 * 
 *         And so elements have to be heapify once the elements are added.
 *         heapify - A process to align the elements to complete the fulfillment
 *         as being heap. How to build the heap? Heapify procedure can be
 *         applied to a node only if its children nodes are heapified. So the
 *         heapification must be performed in the bottom up order first time when elements are initialized first time.
 *         All the nodes from n/2+1 to n are leaves and so no need to do heapify
 *         for leaves.
 * 
 * 
 * 
 *         Final heap-
 * 
 * 
 *         99 45 67 33 22 12
 *
 * 
 * 
 *         Time complexity - O(nlogn) for best, worst and avg case
 * 
 * 
 */
public class HeapSort extends AbstractSort {

	@Override
	public void sort(int[] a) {
		int n = a.length;

		buildHeap(a, n);

		// Now let's put 0th node as last node and heapify from top to bottom again for
		// n-1 element and so on.
		// and so maximum element is always at n-1 index , 2nd maximum as n-2 and so on.

		for (int i = 0; i < n; i++) {
			swap(a, 0, n - i - 1);
			heapify(a, n - i - 1, 0);
		}

	}

	/*
	 * Let's build heap Heapify in bottom to top order while building heap. No need
	 * to heapify for leaves. All the nodes from n/2+1 to n are leaves and so no
	 * need to do heapify for leaves.
	 * 
	 * 2i+1 and 2i+2 are child nodes for ith node. and so 2i+2 = n and so i = n/2-1
	 */
	private void buildHeap(int[] a, int n) {

		for (int i = n / 2 - 1; i >= 0; i--) {
			heapify(a, n, i);
		}
	}

	/*
	 * heapify n elements and considering ith node as root node in top to bottom
	 * approach
	 */
	private void heapify(int[] a, int n, int i) {
		int leftNodeIndex = 2 * i + 1;
		int rightNodeIndex = 2 * i + 2;
		int largest = i;

		if (leftNodeIndex < n && a[leftNodeIndex] > a[largest]) {
			largest = leftNodeIndex;
		}

		if (rightNodeIndex < n && a[rightNodeIndex] > a[largest]) {
			largest = rightNodeIndex;
		}

		if (i != largest) {
			swap(a, i, largest);
			// Recursively heapify the affected sub-tree
			heapify(a, n, largest);
		}

	}

}
