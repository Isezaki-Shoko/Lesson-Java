package jp.co.aforce.sample;

public class OneweekTest {
	public static void main(String[] args) {

		Oneweek day = Oneweek.MONDAY;
		System.out.println(day);

		for (Oneweek d : Oneweek.values()) {
			System.out.println(d);
		}

	}
}
