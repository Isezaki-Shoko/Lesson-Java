package jp.co.aforce.sample;

public class Student1 {
	public static void main(String args[]) {
		
		int[] scores = {55,84,78};
		
		Student s =new Student("伊勢﨑笙子",scores);
		
		s.showAvr();
	}
}
