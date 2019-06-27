package com.nagendra547;

import java.util.HashMap;
import java.util.Map;

import com.nagendra547.sort.factory.SortingType;

/**
 * 
 * @author nagendra
 *
 */
public class AlgoStatistics {
	private SortingType sortingType;
	private Map<Integer, Long> time = new HashMap<>();

	public AlgoStatistics(SortingType type) {
		this.sortingType = type;
	}

	public SortingType getSortingType() {
		return sortingType;
	}

	public void setSortingType(SortingType sortingType) {
		this.sortingType = sortingType;
	}

	public Map<Integer, Long> getTime() {
		return time;
	}

	public void setTime(Map<Integer, Long> time) {
		this.time = time;
	}
	
	@Override
	public String toString() {
		return sortingType +" - " +time; 
	}
}
