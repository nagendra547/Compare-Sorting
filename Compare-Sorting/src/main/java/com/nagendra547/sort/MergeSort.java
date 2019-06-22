package com.nagendra547.sort;

/**
 * 
 * 
MergeSort(arr[], l,  r)
If r > l
     1. Find the middle point to divide the array into two halves:  
             middle m = (l+r)/2
     2. Call mergeSort for first half:   
             Call mergeSort(arr, l, m)
     3. Call mergeSort for second half:
             Call mergeSort(arr, m+1, r)
     4. Merge the two halves sorted in step 2 and 3:
             Call merge(arr, l, m, r)
             
 * @author nagendra
 *
 */
public class MergeSort extends AbstractSort {

	@Override
	public void sort(int[] a) {

		mergeSort(a, 0, a.length - 1);
	}

	private void mergeSort(int[] a, int low, int high) {
		if (low < high) {
			int mid =(high + low) / 2;
			mergeSort(a, low, mid);
			mergeSort(a, mid + 1, high);
			merge(a, low, mid, high);

		}
	}

	private void merge(int[] a, int low, int mid, int high) {
		int size1 = mid - low + 1;
		int size2 = high - mid;

		int first[] = new int[size1];
		int second[] = new int[size2];

		for (int i = 0; i < size1; i++) {
			first[i] = a[i + low];
		}

		for (int j = 0; j < size2; j++) {
			second[j] = a[mid + j + 1];
		}

		int i = 0, j = 0;

		int k = low;

		while (i < size1 && j < size2) {
			if (first[i] <= second[j]) {
				a[k] = first[i];
				i++;
			} else {
				a[k] = second[j];
				j++;
			}
			k++;
		}

		while (i < size1) {
			a[k] = first[i];
			i++;
			k++;
		}

		while (j < size2) {
			a[k] = second[j];
			j++;
			k++;
		}

	}

}
