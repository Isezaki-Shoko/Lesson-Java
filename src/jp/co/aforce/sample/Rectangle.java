package jp.co.aforce.sample;

public class Rectangle {
	int width;
	int height;

	Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	Rectangle(int width) {
		this.width = width;
		this.height = width;
	}

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(10, 5);
		Rectangle r2 = new Rectangle(8);
		System.out.println("r1 幅：" + r1.width + " 高さ：" + r1.height);
		System.out.println("r2 幅：" + r2.width + " 高さ：" + r2.height);
	}
}
