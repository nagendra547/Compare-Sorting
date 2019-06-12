package com.nagendra547.sort;

/*
An optimized version of BubbleSort.
Really great when to sort 

*/
public class BubbleSortOptimized extends AbstractSort{

	@Override
	public void sort(int[] a) {
		boolean swap = true;
		int length = a.length;
		for (int i= 0; i<length; i++){
			swap = false;
			for (int j =0; j< length-i-1; j++){
				if (a[j] > a[j+1]){
					swap(a, j, j+1);
					swap = true;
				}
			}
			if(swap == false){
				break;
			}
			printArray(a);
		}
		
	}

}
