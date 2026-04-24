package jp.co.aforce.sample;

public class Practice16 {
	public static void main(String args[]) {
		
		int[] scores = {80, 90, 70};
		int totalScore = 0;

		// ① 合計だけやる
		for (int i = 0; i < scores.length; i++) {
		    totalScore += scores[i];
		}

		// ② ループの外で計算
		double average = (double) totalScore / scores.length;

		// ③ 判定
		boolean isPassed = average >= 60;

		// ④ 出力
		System.out.println("平均: " + average);
		System.out.println("合格か？ " + isPassed);
		
	}
}