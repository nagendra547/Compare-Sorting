package com.nagendra547.sort;

/*

The selection sort algorithm sorts an array by repeatedly finding the minimum element (considering ascending order) from unsorted part and putting it at the beginning. The algorithm maintains two subarrays in a given array.

1) The subarray which is already sorted.
2) Remaining subarray which is unsorted.

In every iteration of selection sort, the minimum element (considering ascending order) from the unsorted subarray is picked and moved to the sorted subarray.


Best/Avg/Worst Time Complexity - O(n*n)
Space Complexity - O(1)
When to use Selection Sort - If swapping operation is expensive, as max N swaps happen in the whole operation.
*/

public class SelectionSort extends AbstractSort{

	@Override
	public void sort(int a[]){
		for (int i =0; i <a.length; i++){
			int min = getMin(a, i);
			swap(a, i ,min);
		} 
	}
	
	private int getMin(int a[],int i){
		int minIndex = i;
		i++;	
		for (; i<a.length; i++){
			if (a[i] < a[minIndex]){
				minIndex = i;
			}
		}
		return minIndex;
	}

}
