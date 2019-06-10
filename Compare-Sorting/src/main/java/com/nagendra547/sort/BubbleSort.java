package com.nagendra547.sort;

public class BubbleSort extends AbstractSort{

	@Override
	public void sort(int[] a) {
		for (int i= 0; i< a.length; i++){
			for (int j =0; j< a.length-i-1; j++){
				if (a[j] > a[j+1]){
					swap(a, j, j+1);
				}
			}
			printArray(a);
		}
		
	}

}
