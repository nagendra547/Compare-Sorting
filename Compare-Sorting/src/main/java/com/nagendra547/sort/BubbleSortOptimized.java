package com.nagendra547.sort;

/**
 * 
 * 
An optimized version of BubbleSort.
Really great when to sort 

Original :- 12,  5,  6,  67,  54,  9,  
5,  6,  12,  54,  9,  67,  
5,  6,  12,  9,  54,  67,  
5,  6,  9,  12,  54,  67, ( No swap now and so break)  
5,  6,  9,  12,  54,  67, 

 * @author nagendra
 *
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
			//printArray(a);
		}
		
	}

}
