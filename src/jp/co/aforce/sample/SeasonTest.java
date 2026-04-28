package jp.co.aforce.sample;

public class SeasonTest {
	public static void main(String[] args) {
		Season day=Season.SUMMER;
		System.out.println(day);
		
		for(Season s:Season.values()) {
			System.out.println(s);
		}
		
	}
}
