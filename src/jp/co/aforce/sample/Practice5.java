package jp.co.aforce.sample;

import java.util.ArrayList;
import java.util.List;

public class Practice5 {

	public static void main(String args[]) {
		List<Integer> numberList = new ArrayList<Integer>();
		numberList.add(1);
		numberList.add(2);
		numberList.add(3);
		numberList.add(4);
		numberList.add(5);
		
		for(int i=numberList.size() -1; i >=0; i--) {
			System.out.println(numberList.get(i));
		}
			
		}

}
