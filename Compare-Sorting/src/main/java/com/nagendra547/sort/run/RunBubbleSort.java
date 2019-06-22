package com.nagendra547.sort.run;

import com.nagendra547.sort.BubbleSort;
import com.nagendra547.sort.Sortable;

public class RunBubbleSort{

	public static void main(String str[]){
		int a [] ={12,5,6,67,54,9};
		System.out.println("Running BubbleSort");
		Sortable sr = new BubbleSort();
		sr.printArray(a);
		sr.sort(a);
		sr.printArray(a);
		System.out.println("Finished Running BubbleSort");
	}

}
