package jp.co.aforce.sample;

public class Practice15 {
	public static void main(String args[]) {

		int[][] numbers = {
				{ 1, 2, 3 },
				{ 4, 5, 6 }
		};

		boolean found = false;
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				if (numbers[i][j] == 5) {
					found = true;
					break;

				}
			}
			if (found) {
				break;
			}
		}

		if (found) {
			System.out.println("5を見つけました");
		} else {
			System.out.println("見つかりませんでした");
		}
	}
}
