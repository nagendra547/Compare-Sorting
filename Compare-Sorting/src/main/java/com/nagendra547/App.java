package com.nagendra547;

import java.util.Random;

import com.nagendra547.sort.BubbleSort;
import com.nagendra547.sort.BubbleSortOptimized;
import com.nagendra547.sort.InsertionSort;
import com.nagendra547.sort.SelectionSort;

/**
 * 
 * @author nagendra
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int a[]= {4,1,3,6,9,7,8};
        a = generateNumbers(100000);
        int[] a1 = new int[a.length];
        System.arraycopy( a, 0, a1, 0, a.length );
        //printArray(a1);
        long startTime = System.nanoTime();
        new BubbleSort().sort(a1);
        long endTime = System.nanoTime();
        System.out.println("Time taken for BubbleSort: "+ (endTime-startTime)/1000 +" micros");
        //printArray(a1);
        
        
        System.arraycopy( a, 0, a1, 0, a.length );
        //printArray(a1);
        startTime = System.nanoTime();
        new BubbleSortOptimized().sort(a1);
        endTime = System.nanoTime();
        System.out.println("Time taken for BubbleSortOptimized: "+ (endTime-startTime)/1000 +" micros");
        
        System.arraycopy( a, 0, a1, 0, a.length );
        startTime = System.nanoTime();
        new InsertionSort().sort(a1);
        endTime = System.nanoTime();
        System.out.println("Time taken for InsertionSort: "+ (endTime-startTime)/1000 +" micros");
        
        System.arraycopy( a, 0, a1, 0, a.length );
        startTime = System.nanoTime();
        new SelectionSort().sort(a1);
        endTime = System.nanoTime();
        System.out.println("Time taken for SelectionSort: "+ (endTime-startTime)/1000 +" micros");        
        
        
        

        
    }
    
    public static int[] generateNumbers(int count){
    	int a[] = new int[count];
    	for(int i=0; i<count ; i++){
    		Random r = new Random();
    		a[i]= r.nextInt()%100;
    	}
    	return a;
    }
    
	public static void printArray(int a[]) {
		for (int x : a) {
			System.out.print(x + ",  ");
		}
		System.out.println();
	}
}
