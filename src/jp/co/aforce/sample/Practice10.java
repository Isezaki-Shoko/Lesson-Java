package jp.co.aforce.sample;

public class Practice10 {
	public static void main(String args[]) {
		for (int f = 1; f <= 10; f++) {
			System.out.println(f);
		}

		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println(sum);

		int n = 10;
		int a = 0, b = 1;

		for (int i = 0; i < n; i++) {
			System.out.println(a);
			int next = a + b;
			a = b;
			b = next;
		}
	}
}