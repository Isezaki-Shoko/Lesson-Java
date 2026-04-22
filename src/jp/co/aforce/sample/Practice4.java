package jp.co.aforce.sample;

import java.util.HashMap;
import java.util.Map;

public class Practice4 {
	public static void main(String args[]) {

		Map<String, Integer> shopMap = new HashMap<>();
		shopMap.put("りんご", 100);
		shopMap.put("みかん", 80);
		shopMap.put("バナナ", 120);
		shopMap.put("いちご", 300);

		String Fruit = "りんご";

		if (shopMap.containsKey(Fruit)) {
			System.out.println(shopMap.get(Fruit) + "円");
		} else {
			System.out.println("申し訳ありませんが、その商品は取り扱っておりません。");
		}
	}
}