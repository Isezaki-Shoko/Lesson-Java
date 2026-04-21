package jp.co.aforce.sample;

public class EvenOrOdd2 {
	public static void main(String args[]) {

		double num = -5;
		if (num < 0) {
			System.out.println("負の値");
		} else {
			System.out.println("正の値");
		}

		num = 15;
		if (num % 5 == 0) {
			System.out.println("5の倍数");
		} else {
			System.out.println("5の倍数でない");
		}

		int num1 = 8;
		int num2 = 3;

		int result = num1 + num2;
		System.out.println(result);
		
		int num3 = 10;
		int num4 = 4;

		int outcome = num3 - num4;
		System.out.println(outcome);
		
		int num5 = 6;
		int num6 = 7;

		int outcome2 = num5 * num6;
		System.out.println(outcome2);
	}
}
