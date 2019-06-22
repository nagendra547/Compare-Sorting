package com.nagendra547.sort.run;

import com.nagendra547.sort.InsertionSort;
import com.nagendra547.sort.Sortable;

public class RunInsertionSort{

	public static void main(String str[]){
		int a [] ={12,5,6,67,54,9};
		System.out.println("Running InsertionSort");
		Sortable sr = new InsertionSort();
		sr.printArray(a);
		sr.sort(a);
		sr.printArray(a);
		System.out.println("Finished Running InsertionSort");
	}

}
