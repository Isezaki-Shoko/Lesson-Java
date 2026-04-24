package jp.co.aforce.sample;

public class Student {
	
	private String name;
	private int[]scores;
	
	Student(String name, int[]scores) {
		this.name = name;
		this.scores = scores;
	}
		public void showAvr() {
			int sum = 0;
			
			for(int score : scores) {
				sum +=score;
			}
			double avg=(double)sum/scores.length;
			
			System.out.println("平均点："+avg);
		}	
}
