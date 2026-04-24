package jp.co.aforce.sample;

public class Person {

	private String name;
	private int age;

	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void displayInfo() {
		System.out.println("名前: " + name);
		System.out.println("年齢: " + age);
	}

}
