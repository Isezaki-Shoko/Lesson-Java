package jp.co.aforce.sample;

public class EvenOrOdd {

	public static void main(String args[]) {

		double num = 7;
		if (num % 2 == 0) {
			System.out.println("偶数");
		} else {
			System.out.println("奇数");

			num = 4.5;
			num = num / 2;
			System.out.println(num);

			num = 7.8;
			int integerPart = (int) num;
			double decimalPart = num - integerPart;
			System.out.println("整数：" + integerPart);
			System.out.println("小数：" + decimalPart);

			num = 3.2;
			num = num * 10;
			System.out.println(num);

			num = 0;
			if (num == 0) {
				System.out.println("0である");
			} else {
				System.out.println("0でない");

			}
		}
	}
}
