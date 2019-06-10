package com.nagendra547.sort;

public abstract class AbstractSort implements Sortable {

	public void swap(int a[], int i, int j) {
		int x = a[i];
		a[i] = a[j];
		a[j] = x;
	}

	public void printArray(int a[]) {
		for (int x : a) {
			System.out.print(x + ",  ");
		}
		System.out.println();
	}

}
