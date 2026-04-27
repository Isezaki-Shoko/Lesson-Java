package jp.co.aforce.sample;

public class Practice2Test {
	public static void main(String args[]) {
		final double TAX=0.1;
		System.out.println("消費税率: " + (TAX * 100) + "%");
		
		int x=480;
		double price=x*(1+TAX);
		System.out.println("税込み価格"+price);
		
		String name="shoko";
		System.out.println("名前："+name);
		
		String price1="この商品の値段は";
		String yen="円です";
		System.out.println(price1+price+yen);
		
		
				
		
	}

}
