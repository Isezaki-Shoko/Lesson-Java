package jp.co.aforce.sample;

public class Practice {

	public static void main(String args[]) {

		String name = "shoko";
		int age = 22;
		age = age + 1;
		System.out.println(name + "は次の誕生日で" + age + "歳です。");

		int num1 = 8;
		int num2 = 3;

		int add = num1 + num2;
		int sub = num1 - num2;
		int mul = num1 * num2;
		int div = num1 / num2;
		int rem = num1 % num2;

		System.out.println(add);
		System.out.println(sub);
		System.out.println(mul);
		System.out.println(div);
		System.out.println(rem);

		int test1 = 75;
		int test2 = 88;
		int test3 = 92;

		int sum = test1 + test2 + test3;
		int avg = sum / 3;
		System.out.println(avg);
		
		int price=12000;
		int result=(int)(price*0.7);
		System.out.println(result);
				
	}
}
