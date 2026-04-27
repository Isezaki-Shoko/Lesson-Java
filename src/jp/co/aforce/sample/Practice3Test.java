package jp.co.aforce.sample;

import java.util.ArrayList;
import java.util.Collections;

public class Practice3Test {
	public static void main(String args[]) {
		String[] item = new String[5];
		item[0] = "シャープペンシル";
		item[1] = "ボールペン";
		item[2] = "リングノート";
		item[3] = "クリップ";
		item[4] = "消しゴム";
		System.out.println(item[1]);

		ArrayList<String> nameList = new ArrayList<>();
		nameList.add("山田太郎");
		nameList.add("鈴木花子");
		nameList.add("佐藤二郎");
		nameList.add("山田太郎");
		nameList.add("高橋三郎");
		for (String name : nameList)
			if (name.equals("佐藤二郎")) {
				System.out.println(name);
				break;
			}

		ArrayList<Integer> numList = new ArrayList<>();
		numList.add(10);
		numList.add(15);
		numList.add(16);
		numList.add(19);
		numList.add(11);
		numList.add(12);
		numList.add(18);
		numList.add(20);
		Collections.sort(numList);
		for (int num : numList) {
			System.out.println(num);
		}

		ArrayList<Integer> list3 = new ArrayList<>();
		list3.add(13);
		list3.add(14);
		list3.add(17);
		list3.add(21);
		numList.addAll(list3);
		Collections.sort(numList);
		for (int num : numList) {
			System.out.println(num);
		}
	}
}