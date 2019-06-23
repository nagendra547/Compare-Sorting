package com.nagendra547.sort;

/**
 * 
 * @author nagendra
 * 
 * The key process in quickSort is partition(). 
 * Target of partitions is, given an array and an element x of array as pivot, put x at its correct position 
 * in sorted array and put all smaller elements (smaller than x) before x,
 * and put all greater elements (greater than x) after x.
 * Time Taken   T(n) = T(k) + T(n-k-1) + O(n)
 * Best case O(n)
 * Avg O(nlogn)
 * Worst O(n2)
 * 
 */
public class QuickSort extends AbstractSort {

	@Override
	public void sort(int[] a) {
		quickSort(a, 0, a.length - 1);
	}

	/**
	 * 
	 * @param a
	 * @param low
	 * @param high
	 */
	private void quickSort(int[] a, int low, int high) {
		if (low < high) {
			int pivotIndex = partition(a, low, high);
			quickSort(a, low, pivotIndex - 1);
			quickSort(a, pivotIndex + 1, high);

		}

	}

	/**
	 * 
	 * @param a
	 * @param low
	 * @param high
	 * @return
	 */
	private int partition(int[] a, int low, int high) {
		int pivot= a[high];
		int i = low-1;
		for (int j =low; j< high; j++) {
			if ( a[j]< pivot) {
				i++;
				swap(a, i, j);
			}
		}
		swap(a, i+1, high);
		
		return i+1;
	}

}
