package com.nagendra547.sort;


/**
 * Insertion sort is a simple sorting algorithm that works the way we sort playing cards in our hands.
 Reference :- https://www.geeksforgeeks.org/insertion-sort/
 * @author nagendra
 *
 */
public class InsertionSort extends AbstractSort {

	@Override
	public void sort(int a[]) {
		for (int i = 1; i < a.length; i++) {
			int j = i;
			int key = a[i];
			/*
			 * Move elements of arr[0..i-1], that are greater than key, to one
			 * position ahead of their current position
			 */
			while (j > 0 && key < a[j-1]) {
				a[j] = a[j - 1];
				j--;
			}
			a[j] = key;
			
		}
	}
}
