package jp.co.aforce.sample;

public class Person1 {
	public static void main(String args[]) {

		
		  Person p = new Person("田中太郎", 20);

	        System.out.println("【getterで表示】");
	        System.out.println("名前: " + p.getName());
	        System.out.println("年齢: " + p.getAge());

	        System.out.println("【メソッドで表示】");
	        p.displayInfo();
	    }
	}

