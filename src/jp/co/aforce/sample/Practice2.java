package jp.co.aforce.sample;

import java.util.ArrayList;
import java.util.List;

public class Practice2 {

	public static void main(String args[]) {
		List<Integer> numberList = new ArrayList<Integer>();
		numberList.add(1);
		numberList.add(2);
		numberList.add(3);
		numberList.add(4);
		System.out.println(numberList);
		
		Integer element1=numberList.get(1);
		System.out.println("1番目の要素：" + element1);
		
		numberList.add(5);
		numberList.add(6);
		
		numberList.remove(2);
		numberList.add(1,3);
		numberList.remove(3);
		System.out.println(numberList);
		
		numberList.set(2,4);
		System.out.println(numberList);
		
		numberList.clear();
		System.out.println(numberList);
		
		
		
		
	}
}