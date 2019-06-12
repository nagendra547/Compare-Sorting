package com.nagendra547.sort

public class InsertionSort extends AbstractSort{

	@Override
	public void sort(int a[]){
		for (int i =0 ; i<a.length ; i++){
			if (a[i+1] < a[i]){
			   // Put a[i] elelemnt at xth position or array and shift elements position by 1
			   shiftArray(a, i)

			}
		}
	}
}
