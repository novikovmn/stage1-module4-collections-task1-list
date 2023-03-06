package com.epam.mjc.collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<String> strings = new ArrayList<>(
				Arrays.asList("The", "ArrayList", "class", "has", "many", "useful", "methods"));

		ArrayListCreator arrayListCreator = new ArrayListCreator();
		ArrayList<String> arrayList = arrayListCreator.createArrayList(strings);
		System.out.println(arrayList);

		List<Integer> numbers = new ArrayList<>(Arrays.asList(2, 14, 3, 6, 5, 7));

		LinkedListCreator linkedListCreator = new LinkedListCreator();
		LinkedList<Integer> linkedList = linkedListCreator.createLinkedList(numbers);
		System.out.println(linkedList);

		List<String> nums = new ArrayList<>(Arrays.asList("-5", "-12", "0", "20", "9", "-20", "37"));
		ListSorter listSorter = new ListSorter();
		listSorter.sort(nums);
		System.out.println(nums);

	}

}
