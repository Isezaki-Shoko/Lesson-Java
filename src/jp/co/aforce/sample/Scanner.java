package jp.co.aforce.sample;

public class Scanner {
	public static void main(String args[]) {

		int num = 22;
		if (num % 2 == 0) {
			System.out.println("偶数");
		} else {
			System.out.println("奇数");
		}

		int num1 = 6;
		if (num1 > 0) {
			System.out.println("正の数");
		} else if (num1 < 0) {
			System.out.println("負の数");
		} else {
			System.out.println("0です");
		}

		int a = 3;
		int b = 6;
		int c = 2;
		if (a + b > c && a + c > b && b + c > a) {
			System.out.println("OK");
		} else {
			System.out.println("NG");
		}

		
		int age = 59;
		if (age <= 12) {
			System.out.println("無料");
		} else if (age <= 59) {
			System.out.println("1000円");
		} else if( age>=60) {
			System.out.println("500円");
		}
		
		Integer number=7;
		String message;
		switch (number) {
		case 1:
			message = "月曜日";
			break;
		case 2:
			message = "火曜日";
			break;
		case 3:
			message = "水曜日";
			break;
		case 4:
			message = "木曜日";
			break;
		case 5:
			message = "金曜日";
			break;
		case 6:
			message = "土曜日";
			break;
		case 7:
			message = "日曜日";
			break;
		default:
			message = "不正な数字です";
		}
		System.out.println("現在の番号" + number + " - " + message);
		
		
		Integer month=12;
		String message1;
		switch (month) {
		case 1:
			message1 = "睦月";
			break;
		case 2:
			message1 = "如月";
			break;
		case 3:
			message1 = "弥生";
			break;
		case 4:
			message1 = "卯月";
			break;
		case 5:
			message1 = "皐月";
			break;
		case 6:
			message1 = "水無月";
			break;
		case 7:
			message1 = "文月";
			break;
		case 8:
			message1 = "葉月";
			break;
		case 9:
			message1 = "長月";
			break;
		case 10:
			message1 = "神無月";
			break;
		case 11:
			message1 = "霜月";
			break;
		case 12:
			message1 = "師走";
			break;
		default:
			message1 = "不正な数字です";
		}
		System.out.println("現在の番号" + month + " - " + message1);
		
		String gra="A";
		String message2;
		switch (gra) {
		case "A":
			message2 = "素晴らしい";
			break;
		case "B":
			message2 = "よくできました";
			break;
		case "C":
			message2 = "この調子";
			break;
		case "D":
			message2 = "あともう少し頑張ろう";
			break;
		case "E":
			message2 = "次はもっといい点を目指そう";
			break;
		case "F":
			message2 = "やり直し";
			break;
		default:
			message2 = "不正な文字列です";
		}
		System.out.println("現在の成績" + gra + " - " + message2);
	}
}