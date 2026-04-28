package jp.co.aforce.sample;

public class Counter {
	static int count =0;
	
	void increment() {
		count++;
		
	}

	public static void main(String[] args) {
		Counter c1 = new Counter();
		Counter c2 = new Counter();
		Counter c3 = new Counter();
		
		c1.increment();
		c2.increment();
		c3.increment();
		
		System.out.println("countの値:"+Counter.count);
	}
}
