package jp.co.aforce.sample;

public class PhysicsConstantsTest {
	public static void main(String[] args) {
		double time = 1;
		double distance = PhysicsConstants.SPEED_OF_LIGHT * time;

		System.out.println("光が1秒間に進む距離：" + distance + " m");
	}
}
