package jp.co.aforce.sample;

public class Practice29 {
	public static void main(String args[]) {

		String result = "";
		for (int i = 1; i <= 50; i++) {
			if (i % 3 == 0) {
				result += i + ",";
			}
		}
		System.out.println(result);
	}

}
