package com.nagendra547.sort;

/*
The simplest algo in which, each elemnet is compared with next and swapped if it's greater(Considering we are sorting in Ascending order).

At the end of one for loop, maximum number is the last element in array, but in the process other elements are also swapped

Best/Avg/Worst Time Complexity - O(n*n)
Space Complexity - O(1) 

BubbleSort is easy to implement and it is fast enough when you have small data sets
*/
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
