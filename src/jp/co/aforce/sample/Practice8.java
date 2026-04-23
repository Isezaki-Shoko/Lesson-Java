package jp.co.aforce.sample;

import java.util.Scanner;

public class Practice8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int sum = 0;
		int num;

		System.out.print("整数を入力してください（0で終了）: ");

		while (true) {
			num = sc.nextInt();
			if (num == 0)
				break;
			sum += num;
		}

		System.out.println("合計は: " + sum);

	}
}
