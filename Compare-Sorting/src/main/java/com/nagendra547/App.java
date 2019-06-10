package com.nagendra547;

import java.util.Arrays;
import java.util.Random;

import com.nagendra547.sort.BubbleSort;
import com.nagendra547.sort.BubbleSortOptimized;
import com.nagendra547.sort.Sortable;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	System.out.println("Starting Bubble Sort");
        int a[]= {4,1,3,6,9,7,8};
        Sortable bs = new BubbleSort();
        
        int[] a1 = new int[a.length];

        System.arraycopy( a, 0, a1, 0, a.length );
        bs.sort(a1);
        bs.printArray(a1);
        System.out.println("Finished Bubble Sort");
        
//        //int a[] = generateNumbers(10);
        
        System.out.println("Starting Optimized Bubble Sort");
        Sortable  bso = new BubbleSortOptimized();
        int[] a2 = new int[a.length];
        System.arraycopy( a, 0, a2, 0, a.length );
        bso.sort(a2);
        bso.printArray(a2);
        System.out.println("Finished Optimized Bubble Sort");
    }
    
    public static int[] generateNumbers(int count){
    	int a[] = new int[count];
    	for(int i=0; i<count ; i++){
    		Random r = new Random();
    		a[i]= r.nextInt()%100;
    	}
    	return a;
    }
}
