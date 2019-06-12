package com.nagendra547.sort;

public class RunSelectionSort{

	public static void main(String str[]){
		int a [] ={12,5,6,67,54,9};
		System.out.println("Running SelectionSort");
		SelectionSort sr = new SelectionSort();
		sr.sort(a);
		sr.printArray(a);
		System.out.println("Finished Running SelectionSort");
	}

}
