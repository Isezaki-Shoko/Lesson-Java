package jp.co.aforce.sample;

import java.util.ArrayList;
import java.util.List;

public class Practice11 {
	public static void main(String args[]) {

		int[] numbers = { 0, 1, 2 };
		for (int n : numbers) {
			System.out.println(n);
		}

		List<String> fruitList = new ArrayList<>();

		fruitList.add("パイナップル");
		fruitList.add("マンゴー");
		fruitList.add("パッションフルーツ");

		for (String fruit : fruitList) {
			System.out.println(fruit);
		}

		int[] melt = { 12, 77, 32, 54, 91 };
		int sum = 0;
		for (int num : melt) {
			sum += num;
		}
		System.out.println("合計: " + sum);

		
		
	}
}