package com.nagendra547;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Random;

import com.nagendra547.sort.factory.SortFactory;
import com.nagendra547.sort.factory.SortingType;

/**
 * 
 * @author nagendra
 *
 */
public class App {
	private List<AlgoStatistics> algoStatisticsList = new ArrayList<>();
	private List<SortingType> supportedAlgos = new ArrayList<>();

	public static void main(String[] args) {

		App app = new App();
		SortingType[] supported = { SortingType.BUBBLE, SortingType.BUBBLE_OPTIMIZED, SortingType.INSERTION,
				SortingType.SELECTION, SortingType.QUICK, SortingType.MERGE, SortingType.HEAP };
		app.supportedAlgos.addAll(Arrays.asList(supported));
		for (SortingType type: app.supportedAlgos) {
			app.algoStatisticsList.add(new AlgoStatistics(type));
		}

		int run_list[] = { 10, 100, 1000, 10000,100000 };
		for (int x : run_list) {
			app.runSorting(x);
		}
		for(int x:run_list) {
			System.out.println("For "+x +" elements, following are the time taken by algorithm in miliseconds");
			for(AlgoStatistics algo: app.algoStatisticsList) {
				System.out.println(algo.getSortingType()+" : "+algo.getTime().get(x));
			}
		}
	}

	private void runSorting(int n) {
		int a[] = generateNumbers(n);
		for(SortingType type:supportedAlgos) {
			execute(a, type);
		}
	}

	private void execute(int a[], SortingType type) {
		int[] a1 = new int[a.length];
		System.arraycopy(a, 0, a1, 0, a.length);
		long startTime = System.nanoTime();
		SortFactory.getInstance(type).sort(a1);
		long endTime = System.nanoTime();
		long duration = (endTime - startTime) / 1000;
		updateAlgoTime(type, a1.length, duration);
	}

	private void updateAlgoTime(SortingType type, int length, long duration) {
		// algoStatisticsLis
		Optional<AlgoStatistics> findFirst = algoStatisticsList.stream().filter(p -> p.getSortingType().equals(type))
				.findFirst();
		if (findFirst != null && findFirst.get() != null ) {
			AlgoStatistics algoStatistics = findFirst.get();
			algoStatistics.getTime().put(length, duration);
		}

	}

	private int[] generateNumbers(int count) {
		int a[] = new int[count];
		for (int i = 0; i < count; i++) {
			Random r = new Random();
			a[i] = r.nextInt() % 10000;
		}
		return a;
	}

	protected void printArray(int a[]) {
		for (int x : a) {
			System.out.print(x + ",  ");
		}
		System.out.println();
	}
}
