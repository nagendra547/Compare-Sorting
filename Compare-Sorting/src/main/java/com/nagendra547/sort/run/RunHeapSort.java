package com.nagendra547.sort.run;

import com.nagendra547.sort.HeapSort;
import com.nagendra547.sort.Sortable;

/**
 * 
 * @author nagendra
 *
 */
public class RunHeapSort{

	public static void main(String str[]){
		int a[] = {1,4,5,8,13,11,3,2,66363,7737,8282,111,25,-1,-7,-8};
		System.out.println("Running HeapSort");
		Sortable sr = new HeapSort();
		sr.printArray(a);
		sr.sort(a);
		sr.printArray(a);
		System.out.println("Finished Running HeapSort");
	}

}
