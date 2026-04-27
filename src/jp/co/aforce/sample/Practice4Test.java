package jp.co.aforce.sample;

import java.util.ArrayList;

public class Practice4Test {
	public static void main(String args[]) {

		ArrayList<String> animalList = new ArrayList<>();
		animalList.add("犬");
		animalList.add("猫");
		animalList.add("うさぎ");
		animalList.add("ヘビ");
		
		String cat = "猫";
		if (animalList.contains(cat)) {
			System.out.println(cat+"はリストに含まれています");
		} else {
			System.out.println(cat+"はリストに含まれていません");
		}
		
		Integer Calender=4;
		String message1;
		switch (Calender) {
		case 1:
			message1 = "冬物セール";
			break;
		case 2:
			message1 = "春物を売る";
			break;
		case 3:
			message1 = "春物を売る";
			break;
		case 4:
			message1 = "春物を売る";
			break;
		case 5:
			message1 = "春物セール";
			break;
		case 6:
			message1 = "夏物を売る";
			break;
		case 7:
			message1 = "夏物を売る";
			break;
		case 8:
			message1 = "夏物セール";
			break;
		case 9:
			message1 = "秋物を売る";
			break;
		case 10:
			message1 = "冬物を売る";
			break;
		case 11:
			message1 = "冬物を売る";
			break;
		case 12:
			message1 = "冬物を売る";
			break;
		default:
			message1 = "不正な月です";
		}
		System.out.println("現在の番号" + Calender + " - " + message1);

	}
}
