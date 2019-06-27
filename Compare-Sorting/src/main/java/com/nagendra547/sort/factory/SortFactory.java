package com.nagendra547.sort.factory;

import com.nagendra547.sort.AbstractSort;
import com.nagendra547.sort.BubbleSort;
import com.nagendra547.sort.BubbleSortOptimized;
import com.nagendra547.sort.HeapSort;
import com.nagendra547.sort.InsertionSort;
import com.nagendra547.sort.MergeSort;
import com.nagendra547.sort.QuickSort;
import com.nagendra547.sort.SelectionSort;

/**
 * A factory to provide the sorting strategy instance
 * 
 * @author nagendra
 *
 */
public class SortFactory {

	public static AbstractSort getInstance(SortingType type) {
		switch (type) {
		case BUBBLE:
			return new BubbleSort();
		case BUBBLE_OPTIMIZED:
			return new BubbleSortOptimized();
		case INSERTION:
			return new InsertionSort();
		case SELECTION:
			return new SelectionSort();
		case MERGE:
			return new MergeSort();
		case QUICK:
			return new QuickSort();
		case HEAP:
			return new HeapSort();
		default:
			break;
		}
		return null;
	}

}
