package com.nagendra547.sort.run;

import com.nagendra547.sort.TreeSort;

public class RunTreeSort{

	public static void main(String str[]){
		int a [] ={12,5,6,67,54,9};
		System.out.println("Running TreeSort");
		TreeSort sr = new TreeSort();
		sr.sort(a);
		sr.printArray(a);
		System.out.println("Finished Running TreeSort");
	}

}
