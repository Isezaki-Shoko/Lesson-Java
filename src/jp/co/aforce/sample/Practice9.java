package jp.co.aforce.sample;
import java.util.Scanner;

public class Practice9 {
	public static void main(String args[]) {

		int i = 0;
		do {
			System.out.println(i);
			i++;
		} while (i < 11);
		
		
		int total=0;
		int k =1;
		do {
			total +=k;
			k++;
	}while(k<=100);
		System.out.println(total);
		
		
		Scanner sc = new Scanner(System.in);
		int num;
		int sum=0;
		do {
			System.out.println("整数入力必須");
			num=sc.nextInt();
			
			sum +=  num;
			
		}while(num!=0);
		
		 System.out.println("合計は " + sum + " です。");

	        sc.close();
	        
	        
	        
	}
	

}
