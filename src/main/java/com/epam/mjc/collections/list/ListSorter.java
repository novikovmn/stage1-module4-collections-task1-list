package com.epam.mjc.collections.list;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ListSorter {
	public void sort(List<String> sourceList) {		
		List<Integer> numsFromStrings =	sourceList.stream().map(str -> Integer.parseInt(str)).collect(Collectors.toList());
		numsFromStrings.sort(new ListComparator()); 
		sourceList.clear();
		List<String> stringsFromNumbers = numsFromStrings.stream().map(num -> String.valueOf(num)).collect(Collectors.toList());
		sourceList.addAll(stringsFromNumbers);
	}
}

class ListComparator implements Comparator<Integer> {
	@Override
	public int compare(Integer a, Integer b) {		
		Integer aFunc = 5 * (a ^ 2) + 3; 
		Integer bFunc = 5 * (b ^ 2) + 3; 
		return Integer.compare(aFunc, bFunc);
	}
}
