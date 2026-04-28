package jp.co.aforce.sample;

public class Practice27 {
	public static int add (int num1,int num2) {
		return num1+num2;
	}
	public static int add (int num1,int num2,int num3) {
		return num1+num2+num3;
	}
	
    public static void main(String[] args) {
    	int result1=add(9,8);
    	int result2=add(3,6,7);
    	
    	System.out.println("2つの整数の和：" + result1);
        System.out.println("3つの整数の和：" + result2);
    }
}
