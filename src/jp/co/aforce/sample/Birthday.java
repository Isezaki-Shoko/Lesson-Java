package jp.co.aforce.sample;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Birthday {
	public static void main(String args[]) {
		
		LocalDate today=LocalDate.now();
		LocalDate birthday = LocalDate.of(today.getYear(),10,4);
		
		 long days = ChronoUnit.DAYS.between(today, birthday);

	        // 結果表示
	        System.out.println("誕生日まであと " + days + " 日です！");
	        
	        
	    }
	
	}

