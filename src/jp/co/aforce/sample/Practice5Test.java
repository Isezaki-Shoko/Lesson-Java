package jp.co.aforce.sample;

import java.util.Random;

public class Practice5Test {
	public static void main(String args[]) {

		Random rand = new Random();
		int fortune = rand.nextInt(10);

		String message1;
		switch (fortune) {
		case 0:
			message1 = "吉です";
			break;
		case 1:
			message1 = "中吉です";
			break;
		case 2:
			message1 = "大吉です";
			break;
		default:
			message1 = "凶です";
		}
		System.out.println("現在の番号" + fortune + " - " + message1);

		String result = "";
		for (int i = 1; i <= 100; i++) {
			if (i % 7 == 0) {
				result += i + ",";
			}
		}
		System.out.println(result);

		for (int k = 1; k <= 9; k++) {
			for (int n = 1; n <= 9; n++) {
				System.out.print(k * n + "\t");
			}
			System.out.println();
		}
	}
}
