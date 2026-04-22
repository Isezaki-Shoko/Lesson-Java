package jp.co.aforce.sample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Practice6 {
	public static void main(String args[]) {
		List<Integer> numberList = new ArrayList<>();

		numberList.add(55);
		numberList.add(34);
		numberList.add(28);

		int number = 55;
		if (numberList.contains(number)) {
			System.out.println("この値はリストに含まれています");
		} else {
			System.out.println("この値はリストに含まれていません");
		}

		List<String> letterList = new ArrayList<>();
		letterList.add("apple");
		letterList.add("orange");
		letterList.add("melon");

		Collections.sort(letterList);
		for (String s : letterList) {
			System.out.println(s);
		}

		List<String> FlomList = new LinkedList<>();
		FlomList.add("apple");
		FlomList.add("orange");
		FlomList.add("melon");
		System.out.println(FlomList.get(0));
		System.out.println(FlomList.get(FlomList.size() - 1)); 
	}

}
