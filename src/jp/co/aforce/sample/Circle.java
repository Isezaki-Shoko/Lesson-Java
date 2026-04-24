package jp.co.aforce.sample;

public class Circle {
	double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	public void showArea() {
		double area = Math.PI * radius * radius;
		System.out.println("円の面積は " + area + " です。");
	}

	public static void main(String[] args) {
		Circle circle = new Circle(5.0);
		circle.showArea();
	}
}
