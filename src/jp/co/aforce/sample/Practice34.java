package jp.co.aforce.sample;

public class Practice34 {
	public static void main(String[] args) {
		Thread thread=new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Hello, World!");
			}
		});
	thread.start();
	}
	

}
