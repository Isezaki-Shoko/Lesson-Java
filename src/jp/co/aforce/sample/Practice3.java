package jp.co.aforce.sample;

import java.util.HashMap;
import java.util.Map;

public class Practice3 {
	public static void main(String args[]) {

		Map<String, Integer> nameMap = new HashMap<>();
		nameMap.put("Bob", 1);
		nameMap.put("Alice", 2);
		nameMap.put("Jphn", 2);
		nameMap.put("Tom", 1);
		System.out.println(nameMap);

		int value = nameMap.get("Alice");
		System.out.println(value);

		int value1 = nameMap.get("Tarou");
		System.out.println(value1);
		
		nameMap.remove("Alice");
		System.out.println(nameMap);
	}
}