package com.nagendra547.sort.run;

import com.nagendra547.sort.BubbleSortOptimized;
import com.nagendra547.sort.Sortable;

public class RunBubbleSortOptimized{

	public static void main(String str[]){
		int a [] ={12,5,6,67,54,9};
		System.out.println("Running BubbleSortOptimized");
		Sortable sr = new BubbleSortOptimized();
		sr.printArray(a);
		sr.sort(a);
		sr.printArray(a);
		System.out.println("Finished Running BubbleSortOptimized");
	}

}
